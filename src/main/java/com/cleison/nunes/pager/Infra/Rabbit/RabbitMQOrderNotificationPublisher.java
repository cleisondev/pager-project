package com.cleison.nunes.pager.Infra.Rabbit;

import com.cleison.nunes.pager.Domain.Interface.OrderNotificationPublisher;
import com.cleison.nunes.pager.Domain.Order.OrderStatusChangedEvent;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQOrderNotificationPublisher implements OrderNotificationPublisher {

    private final RabbitTemplate rabbitTemplate;

    public RabbitMQOrderNotificationPublisher(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }


    @Override
    public void publish(OrderStatusChangedEvent orderEvent) {
        rabbitTemplate.convertAndSend("order.exchange","order.routingkey", orderEvent);
    }
}
