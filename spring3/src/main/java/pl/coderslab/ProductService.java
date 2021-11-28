package pl.coderslab;

import org.springframework.stereotype.Component;
import pl.coderslab.shop.Product;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductService {

    private List<Product> productList;

    public ProductService() {
        productList = new ArrayList<>();
        productList.add(new Product(1,"product1",100.2));
        productList.add(new Product(2,"product2",200.2));
        productList.add(new Product(3,"product3",300.2));
        productList.add(new Product(4,"product4",400.2));
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void addProduct(Product product) {
        product.setId(productList.size()+2);
        productList.add(product);
    }

    public Product getProduct(int id) {
        return productList.get(id);
    }

    public void update(Product product) {
        productList.set(product.getId(), product);
    }
}
