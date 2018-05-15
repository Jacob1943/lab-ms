package me.ye.lab.ms.common.config;

import me.ye.lab.ms.common.service.SequenceGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoOperations;

/**
 * @author Jacob
 * @date 2018/5/16
 */
@Configuration
public class SequenceGeneratorConfig {





    @Bean
    public SequenceGenerator sequenceGenerator(MongoOperations mongoOperations) {
        return new SequenceGenerator(mongoOperations);
    }
}
