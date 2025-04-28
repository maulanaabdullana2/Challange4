package day341;

import day341.hr.Employee;
import day341.hr.Programmer;
import day341.hr.Qa;
import day341.hr.Sales;

import java.util.List;

public interface IEmployees {
    List<Employee> initListEmployee();

    void displayEmployees(List<Programmer> employees, List<Sales>sales, List<Qa> qa);


    void generateSalary(List<Programmer> employees, List<Sales> sales, List<Qa> qa);


    void generateTax(List<Programmer> employees, List<Sales> sales, List<Qa> qa);



}