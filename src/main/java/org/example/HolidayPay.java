package org.example;

public class HolidayPay {

    Employee employee;

    public HolidayPay(Employee employee) {
        this.employee = employee;
    }

    public int getHolidayPay() {
        int numberOfMonths = 12;
        int workingDaysPerYear = 247;
        return (employee.getAverageSalary() * numberOfMonths / workingDaysPerYear * employee.getNumberOfVacationDays());
    }
}
