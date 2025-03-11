package com.cleison.nunes.pager.Infra.Repositories;

import com.cleison.nunes.pager.Domain.Pager.Pager;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagerRepository extends MongoRepository<Pager,String> {
}
