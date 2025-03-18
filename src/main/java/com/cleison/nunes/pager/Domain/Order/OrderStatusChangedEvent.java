package com.cleison.nunes.pager.Domain.Order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
public class OrderStatusChangedEvent implements Serializable {
    private String orderId;
    private String status;
    private String phoneNumber;
    private String userName;

    public OrderStatusChangedEvent(Order orderData) {
        this.orderId = orderData.getId();
        this.status = orderData.getStatus();
        this.phoneNumber = orderData.getUser().getPhoneNumber();
        this.userName = orderData.getUser().getName();
    }
}
