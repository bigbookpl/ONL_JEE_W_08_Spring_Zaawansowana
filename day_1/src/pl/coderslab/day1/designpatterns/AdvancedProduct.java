package pl.coderslab.day1.designpatterns;

public class AdvancedProduct implements Product {

    private String name;
    private String price;
    private String discount;

    public AdvancedProduct(String name, String price, String discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
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
