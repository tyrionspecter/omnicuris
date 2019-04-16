package com.omnicuris.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.omnicuris.api.model.Item;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
}
