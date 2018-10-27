
package org.superklamer;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.superklamer package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AddProductResponse_QNAME = new QName("http://superklamer.org/", "addProductResponse");
    private final static QName _GetProductsResponse_QNAME = new QName("http://superklamer.org/", "getProductsResponse");
    private final static QName _GetProductsv2_QNAME = new QName("http://superklamer.org/", "getProductsv2");
    private final static QName _Product_QNAME = new QName("http://superklamer.org/", "Product");
    private final static QName _GetProducts_QNAME = new QName("http://superklamer.org/", "getProducts");
    private final static QName _FetchCategoriesResponse_QNAME = new QName("http://superklamer.org/", "fetchCategoriesResponse");
    private final static QName _GetProductsv2Response_QNAME = new QName("http://superklamer.org/", "getProductsv2Response");
    private final static QName _FetchCategories_QNAME = new QName("http://superklamer.org/", "fetchCategories");
    private final static QName _AddProduct_QNAME = new QName("http://superklamer.org/", "addProduct");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.superklamer
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetProductsv2Response }
     * 
     */
    public GetProductsv2Response createGetProductsv2Response() {
        return new GetProductsv2Response();
    }

    /**
     * Create an instance of {@link FetchCategoriesResponse }
     * 
     */
    public FetchCategoriesResponse createFetchCategoriesResponse() {
        return new FetchCategoriesResponse();
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link FetchCategories }
     * 
     */
    public FetchCategories createFetchCategories() {
        return new FetchCategories();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link GetProductsResponse }
     * 
     */
    public GetProductsResponse createGetProductsResponse() {
        return new GetProductsResponse();
    }

    /**
     * Create an instance of {@link GetProductsv2 }
     * 
     */
    public GetProductsv2 createGetProductsv2() {
        return new GetProductsv2();
    }

    /**
     * Create an instance of {@link GetProducts }
     * 
     */
    public GetProducts createGetProducts() {
        return new GetProducts();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://superklamer.org/", name = "addProductResponse")
    public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
        return new JAXBElement<AddProductResponse>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://superklamer.org/", name = "getProductsResponse")
    public JAXBElement<GetProductsResponse> createGetProductsResponse(GetProductsResponse value) {
        return new JAXBElement<GetProductsResponse>(_GetProductsResponse_QNAME, GetProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsv2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://superklamer.org/", name = "getProductsv2")
    public JAXBElement<GetProductsv2> createGetProductsv2(GetProductsv2 value) {
        return new JAXBElement<GetProductsv2>(_GetProductsv2_QNAME, GetProductsv2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Product }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://superklamer.org/", name = "Product")
    public JAXBElement<Product> createProduct(Product value) {
        return new JAXBElement<Product>(_Product_QNAME, Product.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://superklamer.org/", name = "getProducts")
    public JAXBElement<GetProducts> createGetProducts(GetProducts value) {
        return new JAXBElement<GetProducts>(_GetProducts_QNAME, GetProducts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchCategoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://superklamer.org/", name = "fetchCategoriesResponse")
    public JAXBElement<FetchCategoriesResponse> createFetchCategoriesResponse(FetchCategoriesResponse value) {
        return new JAXBElement<FetchCategoriesResponse>(_FetchCategoriesResponse_QNAME, FetchCategoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsv2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://superklamer.org/", name = "getProductsv2Response")
    public JAXBElement<GetProductsv2Response> createGetProductsv2Response(GetProductsv2Response value) {
        return new JAXBElement<GetProductsv2Response>(_GetProductsv2Response_QNAME, GetProductsv2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FetchCategories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://superklamer.org/", name = "fetchCategories")
    public JAXBElement<FetchCategories> createFetchCategories(FetchCategories value) {
        return new JAXBElement<FetchCategories>(_FetchCategories_QNAME, FetchCategories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://superklamer.org/", name = "addProduct")
    public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
        return new JAXBElement<AddProduct>(_AddProduct_QNAME, AddProduct.class, null, value);
    }

}
