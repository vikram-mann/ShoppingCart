package com.app.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.app.shopping.service.ItemService;

@RestController
@RequestMapping("cart")
public class ItemController {

	@Autowired
	private ItemService service;
	
	@GetMapping(value = "items")
   public ResponseEntity<List<Object[]>> listAll() {
      List<Object[]> items = service.listAll();
      return ResponseEntity.ok().body(items);
   }
}
