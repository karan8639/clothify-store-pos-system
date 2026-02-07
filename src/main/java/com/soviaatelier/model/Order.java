package com.soviaatelier.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public class Order {

    private String orderId;
    private String date;
    private String customerId;
    private Double totalAmount;
    private String staffId;


}
