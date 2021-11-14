package pl.coderslab.day2.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main01 {

    static <T> void printList(List<T> src, Filter<T> f) {
        for (T s : src) {
            if (f.check(s)) {
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);

        IntegerFilter<Integer> filter = new IntegerFilter<>();
        printList(integerList, filter);

///---------------- KLASA ANONIMOWA -----------------------------
        printList(integerList, new Filter<Integer>() {
            @Override
            public boolean check(Integer v) {
                return (int) v < 20;
            }
        });
///---------------- LAMBDA  -------------------------------------
        printList(integerList, v -> (int) v < 20);
///---------------- LAMBDA REFERENCJA DO METODY -----------------
        printList(integerList, Main01::check);
///---------------- LAMBDA Z RETURNEM ---------------------------
        printList(integerList, v -> {
                    //jakis dodatkowy .....
                    return (int) v < 20;
                }
        );
//------------------ STREAM --------------------------------------
        integerList.stream().filter(v -> (int) v <20).forEach(System.out::println);
        integerList.stream().filter(Main01::check).forEach(System.out::println);
    }

    private static boolean check(Integer v) {
        return (int) v < 20;
    }
}