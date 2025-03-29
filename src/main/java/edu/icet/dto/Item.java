package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Item {
    private Integer id;
    private String itemCode;
    private  String itemName;
    private double price;
    private Integer discount;
}
