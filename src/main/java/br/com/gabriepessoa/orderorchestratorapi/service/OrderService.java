package br.com.gabriepessoa.orderorchestratorapi.service;

import br.com.gabriepessoa.orderorchestratorapi.domain.Order;
import br.com.gabriepessoa.orderorchestratorapi.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrderService {

    private OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(UUID id) {
        Optional<Order> orderId = orderRepository.findById(id);
        return orderId.get();
    }

}

