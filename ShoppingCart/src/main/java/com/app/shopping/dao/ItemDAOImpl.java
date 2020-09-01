package com.app.shopping.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.shopping.model.Item;

@Repository
public class ItemDAOImpl implements ItemDAO {
	
	@Autowired
	private EntityManager manager;
	

	@Override
	public Item getByName(String itemName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> getByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Object[]> listAll() {

		
		String queryText = "select it.name, it.description, ct.name from Item it left join Category ct on (it.category = ct.category_id)";
		
		List<Object[]> rows = manager.createQuery(queryText).getResultList();
        
        return  rows;
		
		//return (List<Item>) manager.createQuery("From Item", Item.class).getResultList();
		
		//SELECT it.name, it.description, ct.name From Item it, Category ct Where it.category = ct.category_id
	}

}