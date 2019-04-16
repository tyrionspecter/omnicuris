package com.omnicuris.api.service;


import java.time.LocalDate;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.omnicuris.api.model.Order;
import com.omnicuris.api.repository.OrderRepository;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Iterable<Order> getAllOrders() {
        return this.orderRepository.findAll();
    }

    @Override
    public String create(Order order) {
        order.setDateCreated(LocalDate.now());
        this.orderRepository.save(order);
        return "Order saved";
    }

    @Override
    public void update(Order order) {
        this.orderRepository.save(order);
    }
}
