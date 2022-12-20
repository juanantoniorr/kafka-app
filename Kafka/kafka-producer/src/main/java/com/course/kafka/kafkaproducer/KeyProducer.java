package com.course.kafka.kafkaproducer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class KeyProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(FixedRateProducer.class);
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;
    public void sendMessage(String key, String value){
        //topic with 3 partitions
        kafkaTemplate.send("t-multipartition", key, value);
    }
}
