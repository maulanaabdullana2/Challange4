package day34;

import java.time.LocalDate;

public class Qa extends Employee{
    private double makan;

    public Qa(String nationalId, String fullname, int empId, LocalDate hireDate, Roles role, double salary, double totalSalary, double makan) {
        super(nationalId, fullname, empId, hireDate, role, salary, totalSalary);
        this.makan = makan;
    }

    @Override
    public String toString() {
        return super.toString() + "Qa{" +
                "makan=" + makan +
                '}';
    }
}
