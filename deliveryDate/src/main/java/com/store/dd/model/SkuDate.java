package com.store.dd.model;

import java.util.Date;

public class SkuDate {
 private Sku sku;
 private Date date;
 
 
public SkuDate(Sku sku) {
	super();
	this.sku = sku;
	this.date = new Date();
}
public Sku getSku() {
	return sku;
}
public void setSku(Sku sku) {
	this.sku = sku;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}

	
	
}
