package pl.coderslab.day1.designpatterns.taks2;

public class SimpleProduct implements Product {

    private String name;
    private String price;

    public SimpleProduct(String name, String price) {
        this.name = name;
        this.price = price;
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
