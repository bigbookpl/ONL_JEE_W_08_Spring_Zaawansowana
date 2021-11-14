package pl.coderslab.day2.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collector;

public class Main05 {

    public static void main(String[] args) {

        List<Object> list = Arrays.asList(1000,"Hello",-2003,"World",true);

        Predicate<Object> isString = input -> input instanceof String;
        Consumer<Object> printer = input -> System.out.println(input);

        list.stream()
                .filter(input -> isString(input))
                .filter(input -> ((String) input).startsWith("W"))
                .forEach(printer);

//        String t1 = "19098923";
//
//        if (isString.test(t1)){
//            printer.accept(t1);
//        }
//
    }

    public static Boolean isString(Object input){
        return input instanceof String;
    }

}
