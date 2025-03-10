package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.HashMap;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderRequest {
    private Order order;
    private HashMap<String, Integer> items;
}
