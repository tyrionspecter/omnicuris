package com.omnicuris.api.dto;

import com.omnicuris.api.model.Item;

public class OrderProductDto {

    private Item product;
    private Integer quantity;

    public Item getProduct() {
        return product;
    }

    public void setProduct(Item product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
