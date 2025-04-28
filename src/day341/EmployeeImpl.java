package day341;

import day34.Roles;
import day341.hr.Employee;
import day341.hr.Programmer;
import day341.hr.Qa;
import day341.hr.Sales;
import day341.salary.Comission;
import day341.salary.Overtime;
import day341.salary.Transportasi;

import java.time.LocalDate;
import java.util.List;

public class EmployeeImpl implements IEmployees {
    @Override
    public List<Employee> initListEmployee() {
        Programmer emp1 = new Programmer(120,"Anton",LocalDate.of(2015,03,03),Roles.PROGRAMMER,6_000_000,
                new Transportasi(LocalDate.now(),500_000,100_000,200_000));

        Programmer emp2 = new Programmer(121,"junardi",LocalDate.of(2025,12,12),Roles.PROGRAMMER,6_000_000,
                new Transportasi(LocalDate.now(),500_000,500_000,700_000));

        Sales emp3 = new Sales(100,"Fatur",LocalDate.of(2019,01,15),Roles.SALES,3_000_000,
                new Comission(LocalDate.now(),350_000,250_000));


        Qa emp4 = new Qa(200,"Ellise",LocalDate.of(2020,12,12),Roles.QA,4_500_000,
                    new Overtime(LocalDate.now(),10_000)
                );

//        emp1.calculteTotalSalry();

        return List.of(emp1,emp2,emp3,emp4);
    }

    @Override
    public void displayEmployees(List<Programmer> employees, List<Sales> sales, List<Qa> qa) {
        for (Programmer programmer : employees) {
            System.out.println(programmer.toString());
        }
        for (Sales sale : sales) {
            System.out.println(sale.toString());
        }
        for (Qa tester : qa){
            System.out.println(tester.toString());
        }
    }

    @Override
    public void generateTax(List<Programmer> employees, List<Sales> sales, List<Qa> qa) {
        for (Programmer emp : employees){
            emp.calculateTax();
        }


        for (Qa emp : qa){
            emp.calculateTax();
        }



        for (Sales emp : sales){
            emp.calculateTax();
        }
    }

    @Override
    public void generateSalary(List<Programmer> employees, List<Sales> sales,List<Qa> qa) {
        for (Programmer emp : employees){
            emp.calculteTotalSalry();
        }

        for (Sales emp : sales){
            emp.calculteTotalSalry();
        }

        for (Qa emp : qa){
            emp.calculteTotalSalry();
        }


    }

}