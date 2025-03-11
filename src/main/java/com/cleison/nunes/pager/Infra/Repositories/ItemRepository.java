package com.cleison.nunes.pager.Infra.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.cleison.nunes.pager.Domain.Item.Item;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends MongoRepository<Item, String> {
}
