package com.omnicuris.api.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.omnicuris.api.exceptions.RecordNotFoundException;
import com.omnicuris.api.model.Item;
import com.omnicuris.api.repository.ItemRepository;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {


    private ItemRepository productRepository;

    public ItemServiceImpl(ItemRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Item> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Item getProduct(long id) {
        return productRepository
          .findById(id)
          .orElseThrow(() -> new RecordNotFoundException("Item not found"));
    }

    @Override
    public Item save(Item product) {
        return productRepository.save(product);
    }
}
