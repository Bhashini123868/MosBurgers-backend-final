package edu.icet.service;


import edu.icet.dto.OrderRequest;
import edu.icet.entity.OrderEntity;

import java.util.List;

public interface OrderService {
    void saveOrder(OrderRequest orderRequest);
    OrderEntity getOrderById(int orderId);
    List<OrderEntity> getAllOrders();
    boolean deleteOrder(int orderId);
}
