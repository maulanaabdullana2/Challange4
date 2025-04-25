package day34;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        IEmployee empInterface = new Employeelmpl();


        var lisEmployee = empInterface.initlistEmployee();
        empInterface.dispPlayemployee(lisEmployee);




    }
}