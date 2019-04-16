package com.omnicuris.api.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.omnicuris.api.exceptions.RecordNotFoundException;
import com.omnicuris.api.model.Item;
import com.omnicuris.api.model.Response;
import com.omnicuris.api.repository.ItemRepository;

import javassist.tools.web.BadHttpRequest;


@RestController
@RequestMapping(path = "api/items")
public class ItemController {

	@Autowired
	ItemRepository itemRepository;

	@GetMapping
	public Iterable<Item> findAll() {
		Iterable<Item> items = itemRepository.findAll();
		int counter = 0;
		for (@SuppressWarnings("unused") Object i : items) {
			counter++;
		}
		if (counter == 0) {
			throw new RecordNotFoundException("No Items Exists in DB");
		}
		return items;
	}

	@GetMapping(path = "{itemID}")
	public Optional<Item> find(@PathVariable("itemID") Long itemID) {
		Optional<Item> item =  itemRepository.findById(itemID);
		if (item == null) {
			throw new RecordNotFoundException("Item Code-" + itemID);
		}
		return item;
	}

	@PostMapping("/create")
	public Response create(@Valid @RequestBody Item item) {
		Item insert = itemRepository.save(item);
		Response response = new Response();
		if (insert != null) {
			response.setMessage("Item Inserted Successfully to DB");
		} else {
			response.setMessage("Something wrong with DB or Value");
		}
		return response;
	}

	@DeleteMapping(path = "{itemID}")
	public void delete(@PathVariable("itemID") Long itemID) {
		itemRepository.deleteById(itemID);
	}

	@PutMapping(path = "{itemID}")
	public Item update(@PathVariable("itemID") Long itemID, @RequestBody Item item) throws BadHttpRequest {
		if (itemRepository.existsById(itemID)) {
			item.setId(itemID);
			return itemRepository.save(item);
		} else {
			throw new BadHttpRequest();
		}
	}

}

