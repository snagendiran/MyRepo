package com.store.cloth.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.store.cloth.model.Sku;

@Service
public interface SkuDetailsService {
	public Sku fetchSkuDetailsById(String id);

	public Sku insertSkuDetails(Sku sku);
}
