package pl.coderslab.day2.interfaces;

import java.time.LocalDate;

public class Employee {
    private String firstname;
    private String surname;
    private String gender;
    private LocalDate dayOfBirth;
    private Double salary;

    public Employee(String firstname, String surname, String gender, LocalDate dayOfBirth, Double salary) {
        this.firstname = firstname;
        this.surname = surname;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.salary = salary;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getDayOfBirth() {
        return dayOfBirth;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", dayOfBirth='" + dayOfBirth + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
