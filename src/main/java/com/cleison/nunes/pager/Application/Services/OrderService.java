package com.cleison.nunes.pager.Application.Services;

import com.cleison.nunes.pager.Domain.Order.Order;
import com.cleison.nunes.pager.Domain.Order.OrderDTO;
import com.cleison.nunes.pager.Infra.Repositories.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private OrderRepository _orderRepo;

    public OrderService(OrderRepository _orderRepo) {
        this._orderRepo = _orderRepo;
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

    public Order update(String id, OrderDTO orderDTO){

        Order order = this._orderRepo.findById(id)
                .orElseThrow();

        this._orderRepo.save(order);
        return order;
    }

    public void delete(String id){
        Order order = this._orderRepo.findById(id)
                .orElseThrow();

        this._orderRepo.delete(order);
    }

}
