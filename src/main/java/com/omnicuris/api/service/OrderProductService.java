package com.omnicuris.api.service;


import org.springframework.validation.annotation.Validated;

import com.omnicuris.api.model.OrderProduct;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
public interface OrderProductService {

    OrderProduct create(@NotNull(message = "The items for order cannot be null.") @Valid OrderProduct orderProduct);
}
