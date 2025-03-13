package com.cleison.nunes.pager.Domain.Order;

import com.cleison.nunes.pager.Domain.Item.Item;
import com.cleison.nunes.pager.Domain.Pager.Pager;
import com.cleison.nunes.pager.Domain.User.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "orders")
@NoArgsConstructor
@Getter
@Setter
public class Order {
    @Id
    private String id;
    private User user;
    private List<Item> itens;
    private String status;
    private LocalDateTime orderTime;
    private String queueNumber;

    public Order(OrderDTO orderDto) {
        this.user = orderDto.user();
        this.itens = orderDto.itens();
        this.status = orderDto.status();
        this.orderTime = orderDto.orderTime();
        this.queueNumber = generateQueueNumber();
    }

    private String generateQueueNumber() {
        return "Q-" + System.currentTimeMillis();
    }
}
