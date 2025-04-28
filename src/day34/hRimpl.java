package day34;

import java.time.LocalDate;
import java.util.List;

public class hRimpl implements IEmployee,ITask{
    @Override
    public List<Employee> initlistEmployee() {
        return List.of();
    }

    @Override
    public Employee findEmployeeByid(List<Employee> emps, int id) {
        return null;
    }

    @Override
    public List<Employee> findEmployeeBysalary(List<Employee> emps, double rangeSalary) {
        return List.of();
    }

    @Override
    public void dispPlayemployee(List<Employee> emps) {

    }

    @Override
    public void startProject(LocalDate starDate, LocalDate endDate) {

    }
}
