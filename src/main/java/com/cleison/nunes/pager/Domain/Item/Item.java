package com.cleison.nunes.pager.Domain.Item;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
@Document(collection = "itens")
@NoArgsConstructor
@Getter
@Setter
public class Item {
    @Id
    private String id;
    private String itemTitle;
    private String description;
    private BigDecimal price;
    private Integer quantity;
}
