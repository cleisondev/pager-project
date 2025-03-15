package com.cleison.nunes.pager.Presentation;

import com.cleison.nunes.pager.Application.Services.OrderService;
import com.cleison.nunes.pager.Application.Services.UserService;
import com.cleison.nunes.pager.Domain.Order.Order;
import com.cleison.nunes.pager.Domain.Order.OrderDTO;
import com.cleison.nunes.pager.Domain.User.User;
import com.cleison.nunes.pager.Domain.User.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pager/order")
public class OrderController {
    private OrderService _orderService;

    public OrderController(OrderService orderService) {
        this._orderService = orderService;
    }

    @PostMapping
    public ResponseEntity<Order> insert(@RequestBody OrderDTO orderData){

        Order newOrder = this._orderService.create(orderData);
        return ResponseEntity.ok().body(newOrder);
    };
}
