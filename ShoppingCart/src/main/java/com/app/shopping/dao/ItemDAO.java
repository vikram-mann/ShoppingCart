package com.app.shopping.dao;

import java.util.List;

import com.app.shopping.model.Item;

public interface ItemDAO {
	
	Item getByName(String itemName);
	List<Item> getByCategory(String category);
	List<Object[]> listAll();

}
