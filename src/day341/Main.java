package day341;

import day34.IEmployee;
import day341.hr.Programmer;
import day341.hr.Qa;
import day341.hr.Sales;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        IEmployees empInf = new EmployeeImpl();
        var employees = empInf.initListEmployee();

        //kita casting menggunakan wildcard ?, dari employee to programmer
        // metode ini lebih safe
        List<Programmer> programmers = employees.stream()
                .filter(Programmer.class::isInstance)
                .map(Programmer.class::cast)
                .collect(Collectors.toList());

        List<Sales> sales = employees.stream()
                .filter(Sales.class::isInstance)
                .map(Sales.class::cast)
                .collect(Collectors.toList());

        List<Qa> qa = employees.stream()
                .filter(Qa.class::isInstance)
                .map(Qa.class::cast)
                .collect(Collectors.toList());


        //generate salary
        empInf.generateSalary(programmers,sales, qa);

        empInf.generateTax(programmers,sales,qa);

        empInf.displayEmployees(programmers,sales,qa);



    }
}
