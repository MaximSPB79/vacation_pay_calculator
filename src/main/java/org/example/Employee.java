package org.example;

public class Employee {
    private static int id;
    private String name;
    private int averageSalary;
    private int numberOfVacationDays;

    public int getNumberOfVacationDays() {
        return numberOfVacationDays;
    }

    public void setNumberOfVacationDays(int numberOfVacationDays) {
        this.numberOfVacationDays = numberOfVacationDays;
    }

    public Employee() {
        id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(int averageSalary) {
        this.averageSalary = averageSalary;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Employee.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", averageSalary=" + averageSalary +
                '}';
    }
}
