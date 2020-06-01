package com.store.cloth;

import static org.junit.Assert.assertNotNull;

import java.io.IOException;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.store.cloth.controller.FetchDataController;
import com.store.cloth.model.Sku;
import com.store.cloth.service.SkuDetailsService;

@RunWith(MockitoJUnitRunner.class)
public class ClothStoreControllerTest {
	@Rule public TestName testName = new TestName();	
	@Spy
	@InjectMocks
	private FetchDataController clothStoreController;
	
	@Mock
	private SkuDetailsService skuDetailsService;
	
	@Spy
	private ObjectMapper objectMapper;
	
	@Mock
	private Sku sku;
	
	@Before
	public void init() {
		System.out.println("Testing Executed for "+ testName.getMethodName());
		sku = new Sku();
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void fetchSkuDetailsByIdTest(){
		String id = "1";
		Mockito.when(skuDetailsService.fetchSkuDetailsById(Mockito.anyString())).thenReturn(sku);
		assertNotNull(clothStoreController.fetchSkuDetailsById(id));
		
	}
	
	@Test
	public void AddSkuDetailsTest() throws IOException{
		
		Mockito.when(skuDetailsService.insertSkuDetails(Mockito.any())).thenReturn(sku);
		
		String jsonString = "{\"id\": 1,\"category\": \"men\",\"apparel\": \"Shirt\",\"color\": \"red\",\"products\": [{\"id\": 2,\"category\": \"men\"}]}";
		Sku sku = new ObjectMapper().readValue(jsonString , Sku.class);
		assertNotNull(clothStoreController.AddSkuDetails(sku));
		
	}
}
