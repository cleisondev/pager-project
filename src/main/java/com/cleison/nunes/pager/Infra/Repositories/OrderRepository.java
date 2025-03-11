package com.cleison.nunes.pager.Infra.Repositories;

import com.cleison.nunes.pager.Domain.Order.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
}
