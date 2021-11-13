package pl.coderslab.day1.designpatterns;

import java.util.List;

public class VirtualProduct implements Product {

    private String name;
    private String price;
    private List<String> features;

    public VirtualProduct(String name, String price, List<String> features) {
        this.name = name;
        this.price = price;
        this.features = features;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPrice() {
        return price;
    }

}
