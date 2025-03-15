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

    public OrderStatusChangedEvent(String orderId, String status) {
        this.orderId = orderId;
        this.status = status;
    }
}
