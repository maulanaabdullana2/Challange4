package day341.hr;

import day34.Roles;
import day341.ISalary;
import day341.salary.Transportasi;

import java.time.LocalDate;

public class Programmer extends  Employee implements ISalary {

    private  Transportasi transportasi;

    public Programmer(int empId, String fullName, LocalDate hireDate, Roles role, double salary, Transportasi transportasi) {
        super(empId, fullName, hireDate, role, salary);
        this.transportasi = transportasi;
    }

    public Transportasi getTransportasi() {
        return transportasi;
    }

    public void setTransportasi(Transportasi transportasi) {
        this.transportasi = transportasi;
    }

    @Override
    public void calculteTotalSalry() {
        setTotalSalary(getSalary()+transportasi.getBensin()+transportasi.getSpj()+transportasi.getTransportasi());
    }

    @Override
    public void calculateTax() {
        setTotalTax(getSalary() * 0.01);
    }
}