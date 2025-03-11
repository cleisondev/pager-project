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
    private Pager pager;

    public Order(OrderDTO orderDTO) {
        this.pager = orderDTO.pager();
        this.orderTime = orderDTO.orderTime();
        this.status = orderDTO.status();
        this.itens = orderDTO.itens();
        this.user = orderDTO.user();
    }
}
