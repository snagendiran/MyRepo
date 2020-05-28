package com.store.cloth.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="sku")
public class Sku {
@Id
Long id;
String category;
String apparel;
String color;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public String getApparel() {
	return apparel;
}
public void setApparel(String apparel) {
	this.apparel = apparel;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
	
	
}
