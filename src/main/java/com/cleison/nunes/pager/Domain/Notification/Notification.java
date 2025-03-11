package com.cleison.nunes.pager.Domain.Notification;

import com.cleison.nunes.pager.Domain.Pager.Pager;
import com.cleison.nunes.pager.Domain.User.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document(collection = "notifications")
@NoArgsConstructor
@Getter
@Setter
public class Notification {
    @Id
    private String id;
    private String message;
    private LocalDateTime notificationTime;
    private User user;
    private Pager pager;
}
