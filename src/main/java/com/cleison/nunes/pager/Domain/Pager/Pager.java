package com.cleison.nunes.pager.Domain.Pager;

import com.cleison.nunes.pager.Domain.Order.Order;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "pagers")
@NoArgsConstructor
@Getter
@Setter
public class Pager {
    @Id
    private  String id;
    private String pagerNumber;
    private String Status;
    private Order order;
}
