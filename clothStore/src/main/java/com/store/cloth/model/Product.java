package com.store.cloth.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
public class Product {
@Id @GeneratedValue(strategy=GenerationType.AUTO)
Long id;
String category;
public Long getId() {
	return id;
}
public String getCategory() {
	return category;
}
public void setId(Long id) {
	this.id = id;
}
public void setCategory(String category) {
	this.category = category;
}

	
	
}
