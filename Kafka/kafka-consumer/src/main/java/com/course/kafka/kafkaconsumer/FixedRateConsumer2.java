package com.course.kafka.kafkaconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class FixedRateConsumer2 {
    private static final Logger LOGGER = LoggerFactory.getLogger(FixedRateConsumer.class);
    @KafkaListener(topics = "t-fixedrate2")
    public void consume(String message){
        LOGGER.info("Consumer2 " + message);


    }
}
