package day341.hr;

import day34.Roles;
import day341.ISalary;
import day341.salary.Overtime;

import java.time.LocalDate;

public class Qa extends Employee implements ISalary {
    private Overtime overtime;

    public Qa(int empId, String fullName, LocalDate hireDate, Roles role, double salary, Overtime overtime) {
        super(empId, fullName, hireDate, role, salary);
        this.overtime = overtime;
    }

    public Overtime getOvertime() {
        return overtime;
    }

    public void setOvertime(Overtime overtime) {
        this.overtime = overtime;
    }

    @Override
    public void calculteTotalSalry() {
        setTotalSalary(getSalary()+overtime.getMakan());
    }

    @Override
    public void calculateTax() {
        setTotalTax(getSalary() * 0.01);
    }
}
