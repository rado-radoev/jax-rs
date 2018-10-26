package org.superklamer;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.superklamer.business.ProductServiceImpl;

@WebService
public class ProductCatalog {
	
	ProductServiceImpl productService = new ProductServiceImpl();

	@WebMethod
	public List<String> getProductCategories() {
		return productService.getProductCategories();
	}
	
	@WebMethod
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}
	
	@WebMethod
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}
}
