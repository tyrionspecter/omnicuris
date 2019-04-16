package com.omnicuris.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.omnicuris.api.model.OrderProduct;
import com.omnicuris.api.model.OrderProductPK;



@Repository
public interface OrderProductRepository extends CrudRepository<OrderProduct, OrderProductPK> {

}
