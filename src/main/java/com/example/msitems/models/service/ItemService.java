package com.example.msitems.models.service;

import java.util.List;

import com.example.msitems.models.Item;

public interface ItemService {

	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
}
