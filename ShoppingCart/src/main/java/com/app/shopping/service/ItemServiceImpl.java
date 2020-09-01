package com.app.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.shopping.dao.ItemDAO;
import com.app.shopping.model.Item;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	public ItemDAO dao;
	
	@Override
	public Item getByName(String itemName) {
		
		return dao.getByName(itemName);
	}

	@Override
	public List<Item> getByCategory(String category) {
		
		return dao.getByCategory(category);
	}

	@Override
	public List<Object[]> listAll() {
		
		return dao.listAll();
	}

}
