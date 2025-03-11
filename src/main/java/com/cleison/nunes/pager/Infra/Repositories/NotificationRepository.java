package com.cleison.nunes.pager.Infra.Repositories;

import com.cleison.nunes.pager.Domain.Notification.Notification;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends MongoRepository<Notification, String> {
}
