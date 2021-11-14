package pl.coderslab.day2.interfaces;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Main03 {

    public static void main(String[] args) {

        BinaryOperator<Integer> addition = (i1, i2) -> i1+i2;
        BiFunction<Integer, Integer, Integer> subtraction = (i1, i2) -> i1 - i2;
        BiFunction<Integer, Integer, Integer> multiplication = (i1, i2) -> i1 * i2;
        BiFunction<Integer, Integer, Integer> division = (i1, i2) -> i1 / i2;

        System.out.println("2 + 9 = " + addition.apply(2, 9));
        System.out.println("7 - 5 = " + subtraction.apply(7, 5));
        System.out.println("3 * 7 = " + multiplication.apply(3, 7));
        System.out.println("15 / 5 = " + division.apply(15, 5));

    }
}
