package edu.icet.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class OrderDetails {
    private Integer orderId;
    private String itemCode;
    private int qty;
}
