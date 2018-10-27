package org.superklamer;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.superklamer.model.Product;

@WebService
public interface ProductCatalogInterface {

	@WebMethod(action="fetch_categories", operationName="fetchCategories")
	List<String> getProductCategories();

	@WebMethod
	List<String> getProducts(String category);

	@WebMethod
	boolean addProduct(String category, String product);

	@WebMethod
	List<Product> getProductsv2(String category);

}