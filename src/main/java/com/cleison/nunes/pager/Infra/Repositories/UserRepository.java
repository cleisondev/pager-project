package com.cleison.nunes.pager.Infra.Repositories;

import com.cleison.nunes.pager.Domain.User.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
}
