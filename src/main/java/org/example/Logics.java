package org.example;

import java.util.Scanner;

public class Logics {
    Scanner scanner = new Scanner(System.in);

    public void action() {
        Employee employee = new Employee();
        HolidayPay holidayPay = new HolidayPay(employee);
        System.out.println("Добрый день, введите свое имя:");
        employee.setName(scanner.nextLine());
        System.out.println(employee.getName() + ", введите свою среднемесячную зарплату:");
        employee.setAverageSalary(scanner.nextInt());
        System.out.println(employee.getName() + ", введите количество дней отпуска:");
        employee.setNumberOfVacationDays(scanner.nextInt());
        System.out.println(employee.getName() + ", ваши отпускные " + holidayPay.getHolidayPay() + " руб.");
        System.out.println(employee.getName() + ", хорошего отпуска!");
    }
}
