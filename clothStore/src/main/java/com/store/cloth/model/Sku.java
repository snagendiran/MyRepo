package com.store.cloth.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name ="sku")
public class Sku {
@Id @GeneratedValue(strategy=GenerationType.AUTO)
Long id;
String category;
String apparel;
String color;
@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
List<Product> products;
public Long getId() {
	return id;
}
public String getCategory() {
	return category;
}
public String getApparel() {
	return apparel;
}
public String getColor() {
	return color;
}
public List<Product> getProducts() {
	return products;
}
public void setId(Long id) {
	this.id = id;
}
public void setCategory(String category) {
	this.category = category;
}
public void setApparel(String apparel) {
	this.apparel = apparel;
}
public void setColor(String color) {
	this.color = color;
}
public void setProducts(List<Product> products) {
	this.products = products;
}

	
	
}
