package com.course.kafka.kafkaproducer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class FixedRateProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(FixedRateProducer.class);
    @Autowired
    KafkaTemplate<String, String> kafkaTemplate;
    private AtomicInteger atomicInteger = new AtomicInteger();
//@Scheduled(fixedRate = 1000)
    public void sendMessage(){
        int i = atomicInteger.getAndIncrement();
        LOGGER.info("Value atomic integer " + i);
        kafkaTemplate.send("t-fixedrate", "fixedRate " + i);
    }
}
