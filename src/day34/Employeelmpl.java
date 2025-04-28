package day34;

import java.time.LocalDate;
import java.util.List;

public class Employeelmpl implements IEmployee {
    @Override
    public List<Employee> initlistEmployee() {
        Programmer emp1= new Programmer("300","Anton",101,"oooeoeo",LocalDate.of(2020,12,20),Roles.PROGRAMMER,20000,300_000_00,10000);
        Programmer emp2= new Programmer("300","Anton",101,"oooeoeo",LocalDate.of(2020,12,20),Roles.PROGRAMMER,2000,300_000_00,10000);
        Programmer emp3= new Programmer("300","Anton",101,"oooeoeo",LocalDate.of(2020,12,20),Roles.PROGRAMMER,2000,300_000_00,10000);
        return List.of(emp1,emp3,emp2);
    }

    @Override
    public void dispPlayemployee(List<Employee> emps) {
        for (Employee emp : emps){
            System.out.println(emp.toString());
        }
    }

    @Override
    public List<Employee> findEmployeeBysalary(List<Employee> emps, double rangeSalary) {
        return List.of();
    }

    @Override
    public Employee findEmployeeByid(List<Employee> emps,int id) {
        for (Employee emp : emps){
            if ((emp.getEmpId() == id));
        }
        return null;

    }

    public void displatSalary(List<Employee> emps) {

    }

}
