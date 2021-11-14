package pl.coderslab.day2.interfaces;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main04 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Zenek");
        list.add("Heniek");
        list.add("Zosia");
        list.add("heniek");

//rozwiazanie 1
        list.sort((o1, o2) -> o1.compareToIgnoreCase(o2));
        list.sort(String::compareToIgnoreCase);

//rozwiazanie 2
        NameComparator nameComparator = new NameComparator();
        list.sort(nameComparator);

//rozwiazanie 3
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        for(String name: list){
            System.out.println(name);
        }
    }

}
