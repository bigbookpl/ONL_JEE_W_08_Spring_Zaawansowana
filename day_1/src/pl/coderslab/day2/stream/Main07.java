package pl.coderslab.day2.interfaces;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main07 {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Jan", "Nowak", "male", LocalDate.of(1990, 1, 1), 4783.23),
                new Employee("Marian", "Duda", "male", LocalDate.of(1985, 1, 1), 4283.23),
                new Employee("Janina", "Kowalska", "female", LocalDate.of(2000, 1, 1), 2713.23),
                new Employee("Zygmunt", "Nowak", "male", LocalDate.of(2000, 1, 1), 4781.23)
        );

//        employees.stream()
//                .filter(input -> input.getSurname().startsWith("N"))
//                .forEach(input -> System.out.println(input));

        employees.stream()
                .filter(employee -> isAgedRange(employee, 35, 40))
                .forEach(input -> System.out.println(input));

        //daj 5% podwyżki wszystkim kobietom, które są w wieku między 20 a 30 lat, a ich wynagrodzenie jest nie wyższe niż 3500 zł.

        employees.stream()
                .filter(employee -> employee.getGender() == "female")
                .filter(employee -> isAgedRange(employee, 20, 30))
                .filter(employee -> employee.getSalary() <= 3500)
                .map(employee -> {
                    employee.setSalary(employee.getSalary() * 1.05);
                    return employee;
                })
                .forEach(System.out::println);
    }


    private static boolean isAgedRange(Employee employee, int from, int to) {
        int age = LocalDate.now().getYear() - employee.getDayOfBirth().getYear();
        if (age >= from && age <= to) {
            return true;
        }
        return false;
    }
}
