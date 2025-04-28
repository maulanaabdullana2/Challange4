package day341.salary;

import day341.ISalary;

import java.time.LocalDate;

public class Comission extends Salary {
    private double Commission;
    private double Bonus;


    public Comission(LocalDate payDay, double commission, double bonus) {
        super(payDay);
        Commission = commission;
        Bonus = bonus;
    }

    public double getCommission() {
        return Commission;
    }

    public void setCommission(double commission) {
        Commission = commission;
    }

    public double getBonus() {
        return Bonus;
    }

    public void setBonus(double bonus) {
        Bonus = bonus;
    }
}
