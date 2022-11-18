package com.unosquare.messaging.service;

import com.unosquare.messaging.configuration.RabbitMQExchangeConfiguration;
import com.unosquare.messaging.entity.Product;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProducerService {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Override
    public void sendToDirectExchange(Product payload, String routingKey) {
        rabbitTemplate.convertAndSend(RabbitMQExchangeConfiguration.EXCHANGE_DIRECT, routingKey, payload);

    }

    @Override
    public void sendToTopicExchange(Product payload, String topic) {
        rabbitTemplate.convertAndSend(RabbitMQExchangeConfiguration.EXCHANGE_TOPIC, topic, payload);
    }

    //Empty routing key, in fanout it is ignored
    @Override
    public void sendToFanoutExchange(Product payload) {
        rabbitTemplate.convertAndSend(RabbitMQExchangeConfiguration.FANOUT_EXCHANGE, "", payload);

    }
}
