package pl.coderslab.day1.abstracts;

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[1];

        vehicles[0] = new Car(100,"Focus","sedan");
        vehicles[1] = new Train(200,"EN57",600);

        for(int i=0; i < 2; i++){
            System.out.println(vehicles[i]);
        }

    }
}
