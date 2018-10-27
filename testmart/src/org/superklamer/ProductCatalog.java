package org.superklamer;

import java.util.List;

import javax.jws.WebService;

import org.superklamer.business.ProductServiceImpl;
import org.superklamer.model.Product;

@WebService(endpointInterface="org.superklamer.ProductCatalogInterface",
			name="TestMartCatalog", portName="TestMartCatalogPort", 
			serviceName="TestMartCatalogService", targetNamespace="http://www.testmart.com")
public class ProductCatalog implements ProductCatalogInterface {
	
	ProductServiceImpl productService = new ProductServiceImpl();

	@Override
	public List<String> getProductCategories() {
		return productService.getProductCategories();
	}
	
	@Override
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}
	
	@Override
	public boolean addProduct(String category, String product) {
		return productService.addProduct(category, product);
	}
	
	@Override
	public List<Product> getProductsv2(String category) {
		return productService.getProductsv2(category);
	}
}
