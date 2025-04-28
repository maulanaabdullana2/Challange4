package day341.hr;

import day34.Roles;
import day341.ISalary;
import day341.salary.Comission;

import java.time.LocalDate;

public class Sales extends Employee implements ISalary {
    private Comission comission;

    public Sales(int empId, String fullName, LocalDate hireDate, Roles role, double salary, Comission comission) {
        super(empId, fullName, hireDate, role, salary);
        this.comission = comission;
    }

    @Override
    public void calculateTax() {
        setTotalTax(getSalary() * 0.01);
    }

    @Override
    public void calculteTotalSalry() {
        setTotalSalary(getSalary()+comission.getBonus()+comission.getCommission());
    }
}
