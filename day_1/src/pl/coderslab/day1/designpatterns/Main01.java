package pl.coderslab.day1.designpatterns;

public class Main01 {

    public static void main(String[] args) {

        AppConfig appConfig1 = AppConfig.getInstance();
        AppConfig appConfig2 = AppConfig.getInstance();
        AppConfig appConfig3 = AppConfig.getInstance();

        System.out.println(appConfig1);
        System.out.println(appConfig2);
        System.out.println(appConfig3);

        ProductFactory productFactory = new ProductFactory();

        Product virtual = productFactory.createProduct("virtual");
        System.out.println(virtual);
    }


}
