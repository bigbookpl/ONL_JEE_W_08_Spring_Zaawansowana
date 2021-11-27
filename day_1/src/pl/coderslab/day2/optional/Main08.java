package pl.coderslab.day2.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main08 {

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();

        System.out.println(addressBook.findNameByAddress("016/16161"));

        List<Optional<String>> listOfOptionals = Arrays.asList(
                Optional.empty(), Optional.of("java"), Optional.empty(), Optional.of("python"), Optional.of("php"), Optional.empty(), Optional.of(""));

        listOfOptionals.stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(s -> System.out.println(s));

    }

}
