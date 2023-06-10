package br.com.gabriepessoa.orderorchestratorapi.controller;

import br.com.gabriepessoa.orderorchestratorapi.domain.Order;
import br.com.gabriepessoa.orderorchestratorapi.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<List<Order>> getOrders() {
        List<Order> ordersList = orderService.getOrders();
        return ResponseEntity.ok().body(ordersList);
    }

    @GetMapping("{id}")
    public ResponseEntity<Order> getOrderById(@PathVariable UUID id) {
        Order orderById = orderService.getOrderById(id);
        return ResponseEntity.ok().body(orderById);
    }


}
