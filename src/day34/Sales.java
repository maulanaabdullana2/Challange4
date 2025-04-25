package day34;

import java.time.LocalDate;

public class Sales extends Employee {
    private double bonus;
    private double commision;

    public Sales(String nationalId, String fullname, int empId, LocalDate hireDate, Roles role, double salary, double totalSalary, double bonus, double commision) {
        super(nationalId, fullname, empId, hireDate, role, salary, totalSalary);
        this.bonus = bonus;
        this.commision = commision;
    }
    //    public Sales(String fullName, LocalDate hireDate, double salary,double commision, double bonus) {
//        super(fullName, hireDate, Roles.SALES, salary);
//        this.commision = commision;
//        this.bonus = bonus;
//        setTotalSalary(getSalary()+bonus+commision);
//    }



    @Override
    public String toString() {
        return super.toString() + "Sales{" +
                "bonus=" + bonus +
                ", commision=" + commision +
                '}';
    }
}
