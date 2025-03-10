package edu.icet.controller;

import edu.icet.dto.OrderRequest;
import edu.icet.entity.OrderEntity;
import edu.icet.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/orders")
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/save")
    public void saveOrder(@RequestBody OrderRequest orderRequest){
        orderService.saveOrder(orderRequest);
    }
    @GetMapping("/{id}")
    public OrderEntity getOrderById(@PathVariable int orderId){
        return orderService.getOrderById(orderId);
    }
    @GetMapping("/all")
    public List<OrderEntity> getAllOrders(){
        return orderService.getAllOrders();
    }
    @DeleteMapping("/delete/{id}")
    public boolean deleteOrder(@PathVariable int orderId){
        return orderService.deleteOrder(orderId);
    }

}
