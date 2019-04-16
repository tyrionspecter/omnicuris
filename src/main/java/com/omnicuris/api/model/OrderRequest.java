package com.omnicuris.api.model;

import java.util.List;

import com.omnicuris.api.dto.OrderProductDto;

public class OrderRequest {
	

        private List<OrderProductDto> productOrders;

        public List<OrderProductDto> getProductOrders() {
            return productOrders;
        }

        public void setProductOrders(List<OrderProductDto> productOrders) {
            this.productOrders = productOrders;
        }
    }

