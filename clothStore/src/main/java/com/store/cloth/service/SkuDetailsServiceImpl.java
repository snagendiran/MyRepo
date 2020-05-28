package com.store.cloth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.cloth.model.Sku;
import com.store.cloth.repo.SkuRepository;
@Service
public class SkuDetailsServiceImpl  implements SkuDetailsService {

	@Autowired
	private SkuRepository skuRepository;
	private Sku sku;
	

	@Override
	public Sku fetchSkuDetailsById(String id) {
		
		
		
		return skuRepository.findById(Long.valueOf(id)).map(o-> {return o;}).orElseGet(()->{ System.out.println("No Such value"); return null;}); 
	}


	@Override
	public Sku insertSkuDetails(Sku sku) {
		return skuRepository.save(sku);
		
	}

}
