package pl.coderslab.day1;

public class Main01 {

    public static void main(String[] args) {
        A a1 = new A() {
            @Override
            public void printValue() {
                System.out.println();
            }
        };

        a1.printValue();
    }
}
