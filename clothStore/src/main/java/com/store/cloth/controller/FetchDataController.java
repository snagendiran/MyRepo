package com.store.cloth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.store.cloth.model.Sku;
import com.store.cloth.service.SkuDetailsService;

@RestController
public class FetchDataController {
	
	SkuDetailsService skuDetailsService;
	
	@Autowired
	public FetchDataController(SkuDetailsService skuDetailsService) {
		this.skuDetailsService=skuDetailsService;
	}
	
	@GetMapping(path="/sku/{id}")
	public Sku fetchSkuDetailsById(@PathVariable String id){
		return skuDetailsService.fetchSkuDetailsById(id);
		
	}
	@PostMapping(path="/sku/add")
	public ResponseEntity<Sku> AddSkuDetails(@RequestBody Sku sku){
		return ResponseEntity.ok(skuDetailsService.insertSkuDetails(sku));
		
	}
}
