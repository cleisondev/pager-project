package com.cleison.nunes.pager.Presentation;

import com.cleison.nunes.pager.Application.Services.OrderService;
import com.cleison.nunes.pager.Application.Services.UserService;
import com.cleison.nunes.pager.Domain.Order.Order;
import com.cleison.nunes.pager.Domain.Order.OrderDTO;
import com.cleison.nunes.pager.Domain.Order.OrderStatusDTO;
import com.cleison.nunes.pager.Domain.User.User;
import com.cleison.nunes.pager.Domain.User.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pager/order")
public class OrderController {
    private OrderService _orderService;

    public OrderController(OrderService orderService) {
        this._orderService = orderService;
    }

    @GetMapping()
    public ResponseEntity<List<Order>> getAllOrders(){
        List<Order> orders = this._orderService.getAll();
        return ResponseEntity.ok().body(orders);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Order>> getOrderById(@PathVariable("id") String id){
        Optional<Order> order = this._orderService.getById(id);
        return ResponseEntity.ok().body(order);
    }

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody OrderDTO orderData){

        Order newOrder = this._orderService.create(orderData);
        return ResponseEntity.ok().body(newOrder);
    };

    @PatchMapping ("/{id}")
    public ResponseEntity<Order> updateOrder(@PathVariable("id") String id, @RequestBody OrderStatusDTO newStatus){
        Order order = this._orderService.updateStatusOrder(id, newStatus);
        return ResponseEntity.ok().body(order);
    }

}
