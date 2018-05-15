package me.ye.lab.ms.common.service;

import me.ye.model.constant.SequenceCode;
import me.ye.model.entity.Sequence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.regex.Pattern;

/**
 * @author Jacob
 * @date 2018/5/14
 */

public class SequenceGenerator {


    private MongoOperations operations;
    private static final Logger LOGGER = LoggerFactory.getLogger(SequenceGenerator.class);

    @Autowired
    public SequenceGenerator(MongoOperations operations) {
        this.operations = operations;
    }

    public String getNextSequence(SequenceCode code) {

        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(code));
        Sequence sequence = operations.findOne(query, Sequence.class);

        if (sequence == null) {

            sequence = this.defaultSequence(code);
        }

        String nextSequence = sequence.getNextValue();


        Long currentValueInLong = Long.valueOf(nextSequence);
        Long nextValueInLong = currentValueInLong + sequence.getIncrement();
        String nextValue = String.format("%0" + sequence.getLength() + "d", nextValueInLong);

        Update update = new Update();
        update.set("currentValue", nextSequence);
        update.set("nextValue", nextValue);

        FindAndModifyOptions options = new FindAndModifyOptions();
        operations.findAndModify(query, update, options, Sequence.class);

        return nextSequence;

    }

    public Sequence addSequence(SequenceCode code, String initValue, Integer increment, Integer length) {

        String regex = "\\d{" + length + "}";
        if (!Pattern.matches(regex, initValue)) {
            LOGGER.error("format of initValue incorrect");
            return null;
        }
        String currentValue = initValue;
        Long currentValueInLong = Long.valueOf(currentValue);
        Long nextValueInLong = currentValueInLong + increment;
        String nextValue = String.format("%0" + length + "d", nextValueInLong);
        Sequence sequence = new Sequence(code, initValue, increment, length, currentValue, nextValue);

        operations.save(sequence);

        Query query = new Query();
        query.addCriteria(Criteria.where("_id").is(code));
        Sequence savedSequence = operations.findOne(query, Sequence.class);
        return savedSequence;

    }

    private Sequence defaultSequence(SequenceCode code) {
        return addSequence(code, "00000000", 1, 8);
    }
}
