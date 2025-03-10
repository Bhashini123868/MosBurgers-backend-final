package edu.icet.service.impl;

import edu.icet.dto.OrderRequest;
import edu.icet.entity.OrderEntity;
import edu.icet.repository.OrderRepository;
import edu.icet.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Override
    public void saveOrder(OrderRequest orderRequest) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setCustomerId(orderRequest.getOrder().getCustomerId());
        orderEntity.setTotal(orderRequest.getOrder().getTotal());

        orderRepository.save(orderEntity);

    }

    @Override
    public OrderEntity getOrderById(int orderId) {
        Optional<OrderEntity> order = orderRepository.findById(orderId);
        return order.orElse(null);
    }

    @Override
    public List<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public boolean deleteOrder(int orderId) {
        if (orderRepository.existsById(orderId)){
            orderRepository.deleteById(orderId);
            return true;
        }
        return false;
    }
}
