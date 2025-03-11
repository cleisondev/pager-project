package com.cleison.nunes.pager.Domain.User;


import com.cleison.nunes.pager.Domain.Order.Order;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document(collection = "users")
@NoArgsConstructor
@Getter
@Setter
public class User {
    @Id
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String device;
    private Order order;

}
