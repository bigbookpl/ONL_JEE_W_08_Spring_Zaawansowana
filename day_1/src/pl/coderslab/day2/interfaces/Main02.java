package pl.coderslab.day2.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main02 {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);

        IntegerFilter<Integer> filter = new IntegerFilter<>();

        printList(integerList, filter, new Transform<String, Integer>() {
            @Override
            public String transform(Integer v) {
                return String.valueOf(v - 1);
            }
        });
    }

    static <T, S> void printList(List<S> src, Filter<S> f, Transform<T, S> t) {
        for (S s : src) {
            if (f.check(s)) {
                System.out.println(t.transform(s));
            }
        }
    }
}
