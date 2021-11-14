package pl.coderslab.day2.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main06 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("X","ala","ola","staszek","sabina","basia","kasia");

        names.stream()
                .filter(name -> name.startsWith("a") || name.startsWith("s"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

        List<String> only5charsList = names.stream()
                .filter(name -> name.length() == 5)
                .collect(Collectors.toList());


        String namesTo3chars = names.stream()
                .sorted()
                .map(input -> {
                    if (input.length() > 3) {
                        return input.substring(0, 3);
                    }
                    return input;
                })
                .collect(Collectors.joining(","));

        System.out.println(namesTo3chars);
    }

}
