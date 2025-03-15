package com.cleison.nunes.pager.Domain.Interface;

import com.cleison.nunes.pager.Domain.Order.OrderStatusChangedEvent;

public interface OrderNotificationPublisher {
    void publish(OrderStatusChangedEvent orderEvent);
}
