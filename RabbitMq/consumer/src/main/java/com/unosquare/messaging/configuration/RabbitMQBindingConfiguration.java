package com.unosquare.messaging.configuration;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQBindingConfiguration {

    private static final String DIRECT_ROUTING_KEY_1 = "direct1";
    private static final String DIRECT_ROUTING_KEY_2 = "direct2";
    private static final String TOPIC_RABBITMQ_ROUTING_KEY = "rabbitmq.#" ;
    private static final  String TOPIC_RABBITMQ_SPRING_ROUTING_KEY = "rabbitmq.spring.#";

    @Bean
    public Binding bindingDirectExchangeQueueADirect1(DirectExchange directExchange, Queue queueA) {
        return BindingBuilder.bind(queueA).to(directExchange).with(DIRECT_ROUTING_KEY_1);
    }

    @Bean
    public Binding bindingDirectExchangeQueueBDirect2(DirectExchange directExchange, Queue queueB) {
        return BindingBuilder.bind(queueB).to(directExchange).with(DIRECT_ROUTING_KEY_2);
    }

    @Bean
    public Binding bindingTopicExchangeQueueCTopicRabbitMQ(TopicExchange topicExchange, Queue queueC) {
        return BindingBuilder.bind(queueC).to(topicExchange).with(TOPIC_RABBITMQ_ROUTING_KEY);
    }

    @Bean
    public Binding bindingTopicExchangeQueueDTopicRabbitMQSpring(TopicExchange topicExchange, Queue queueD) {
        return BindingBuilder.bind(queueD).to(topicExchange).with(TOPIC_RABBITMQ_SPRING_ROUTING_KEY);
    }

    @Bean
    public Binding bindingFanoutExchangeQueueEFanout(FanoutExchange fanoutExchange, Queue queueE) {
        return BindingBuilder.bind(queueE).to(fanoutExchange);
    }

    @Bean
    public Binding bindingFanoutExchangeQueueFFanout(FanoutExchange fanoutExchange, Queue queueF) {
        return BindingBuilder.bind(queueF).to(fanoutExchange);
    }

}
