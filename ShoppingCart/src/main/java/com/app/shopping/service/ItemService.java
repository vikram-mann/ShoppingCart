package com.app.shopping.service;

import java.util.List;

import com.app.shopping.model.Item;

public interface ItemService {
	
	Item getByName(String itemName);
	List<Item> getByCategory(String category);
	List<Object[]> listAll();

}
