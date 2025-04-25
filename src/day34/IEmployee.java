package day34;

import java.util.List;

public interface IEmployee {
    List<Employee> initlistEmployee();
    Employee findEmployeeByid(List<Employee>emps,int id);

    List<Employee>findEmployeeBysalary(List<Employee>emps,double rangeSalary);


    void dispPlayemployee(List<Employee>emps);

}
