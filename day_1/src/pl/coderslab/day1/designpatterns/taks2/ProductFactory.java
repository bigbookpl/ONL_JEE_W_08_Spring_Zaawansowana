package pl.coderslab.day1.designpatterns.taks2;

import java.util.ArrayList;

public class ProductFactory {

    public Product createProduct(String type){

        Product product= null;

        if (type.equals("simple")){
            product = new SimpleProduct("Simple Product", "1000");
        }

        if (type.equals("advanced")){
            product = new AdvancedProduct("Advanced Product", "2000", "-15%");
        }

        if (type.equals("virtual")){
            product = new VirtualProduct("Virtual Product", "5000",  new ArrayList<>());
        }

        return product;
    }
}
