package com.unosquare.messaging.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;

@Configuration
public class RabbitMQQueueConfiguration {
    private static String QUEUE_A = "queue-A";
    private static String QUEUE_B = "queue-B";
    private static String QUEUE_C = "queue-C";
    private static String QUEUE_D = "queue-D";
    private static String QUEUE_E = "queue-E";
    private static String QUEUE_F = "queue-F";

    @Bean
    public Queue queueA() {
        return new Queue(QUEUE_A);
    }

    @Bean
    public Queue queueB() {
        return new Queue(QUEUE_B);
    }

    @Bean
    public Queue queueC() {
        return new Queue(QUEUE_C);
    }

    @Bean
    public Queue queueD() {
        return new Queue(QUEUE_D);
    }
    @Bean
    public Queue queueE() {
        return new Queue(QUEUE_E);
    }
    @Bean
    public Queue queueF() {
        return new Queue(QUEUE_F);
    }
}
