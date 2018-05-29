package me.ye.lab.ms.common.config;

import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * @author Jacob
 * @date 2018/5/16
 */
@Configuration
public class MongoConfig extends AbstractMongoConfiguration {

    private MongoProperties mongoProperties;

    @Autowired
    public MongoConfig(MongoProperties mongoProperties) {
        this.mongoProperties = mongoProperties;
    }

    @Override
    public MongoClient mongoClient() {
        return new MongoClient(mongoProperties.getHost(), mongoProperties.getPort());
    }

    @Override
    protected String getDatabaseName() {
        return mongoProperties.getDatabase();
    }

    @Bean
    public MongoOperations mongoOperations() throws Exception {
        return mongoTemplate();
    }
}
