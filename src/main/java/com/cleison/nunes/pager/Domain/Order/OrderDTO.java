package com.cleison.nunes.pager.Domain.Order;

import com.cleison.nunes.pager.Domain.Item.Item;
import com.cleison.nunes.pager.Domain.Pager.Pager;
import com.cleison.nunes.pager.Domain.User.User;

import java.time.LocalDateTime;
import java.util.List;

public record OrderDTO(User user,
                       List<Item> itens,
                       String status,
                       LocalDateTime orderTime,
                       String queueNumber)    {
}
