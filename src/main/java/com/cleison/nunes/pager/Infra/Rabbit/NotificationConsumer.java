package com.cleison.nunes.pager.Infra.Rabbit;

import com.cleison.nunes.pager.Domain.Order.OrderStatusChangedEvent;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationConsumer {
    @RabbitListener(queues = "order.queue")
    public void processNotification(OrderStatusChangedEvent event){

        System.out.println("Enviei " + event.getStatus());
    }
}
