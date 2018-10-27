package org.superklamer.model;

public class Product {
	
	private String name;
	private String sku;
	private double price;
	
	public Product (String name, String sku, double price) {
		this.name = name;
		this.price = price;
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
