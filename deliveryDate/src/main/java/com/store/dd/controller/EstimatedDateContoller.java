package com.store.dd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.store.dd.model.Sku;
import com.store.dd.model.SkuDate;

@RestController
public class EstimatedDateContoller {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/deliv/{id}")
	public SkuDate getDeliveryDate(@PathVariable String id) {
		Sku sku;
		ResponseEntity<Sku> response =restTemplate.exchange("http://localhost:8080/sku/"+id,HttpMethod.GET,null,Sku.class) ;
		sku = (Sku) response.getBody();
		return (new SkuDate(sku));
}
}
