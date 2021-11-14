package pl.coderslab.day2.interfaces;

import java.util.Comparator;

public class NameComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
}
