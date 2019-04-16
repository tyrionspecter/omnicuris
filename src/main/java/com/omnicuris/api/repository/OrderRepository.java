package com.omnicuris.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.omnicuris.api.model.Order;


@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

}
