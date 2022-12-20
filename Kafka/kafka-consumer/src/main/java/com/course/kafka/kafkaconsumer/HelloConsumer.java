package com.course.kafka.kafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class HelloConsumer {
    @KafkaListener(topics = "topic-hello")
    public void consume(String message){
        System.out.println(message);


    }
}