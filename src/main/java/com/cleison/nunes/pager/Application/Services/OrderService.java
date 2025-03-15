package com.cleison.nunes.pager.Application.Services;

import com.cleison.nunes.pager.Domain.Interface.OrderNotificationPublisher;
import com.cleison.nunes.pager.Domain.Order.Order;
import com.cleison.nunes.pager.Domain.Order.OrderDTO;
import com.cleison.nunes.pager.Domain.Order.OrderStatusChangedEvent;
import com.cleison.nunes.pager.Domain.Order.OrderStatusDTO;
import com.cleison.nunes.pager.Infra.Repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private OrderRepository _orderRepo;
    private OrderNotificationPublisher orderNotificationPublisher;

    public OrderService(OrderRepository _orderRepo, OrderNotificationPublisher orderNotificationPublisher) {
        this._orderRepo = _orderRepo;
        this.orderNotificationPublisher = orderNotificationPublisher;
    }

    public List<Order> getAll(){
        return this._orderRepo.findAll();
    }

    public Optional<Order> getById(String id){
        return this._orderRepo.findById(id);
    }

    public Order create(OrderDTO orderDto){

        Order newOrder = new Order(orderDto);
        this._orderRepo.save(newOrder);
        return newOrder;

    }

    public Order updateStatusOrder(String id, OrderStatusDTO newStatus){

        Order existingOrder = this._orderRepo.findById(id)
                .orElseThrow();

        boolean orderReady = !"Pedido pronto".equals(existingOrder.getStatus())
                && "Pedido pronto".equals(newStatus.status());

        existingOrder.setStatus(newStatus.status());
        Order savedOrder = this._orderRepo.save(existingOrder);

        if(orderReady){
            OrderStatusChangedEvent event = new OrderStatusChangedEvent(savedOrder.getId(), savedOrder.getStatus());
            orderNotificationPublisher.publish(event);
        }

        return savedOrder;
    }

    public void delete(String id){
        Order order = this._orderRepo.findById(id)
                .orElseThrow();

        this._orderRepo.delete(order);
    }

}
