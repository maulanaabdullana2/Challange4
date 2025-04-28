package day34;

import java.time.LocalDate;

public class Taskimpl implements ITask {

    @Override
    public void startProject(LocalDate starDate, LocalDate endDate) {
        System.out.println("start project");
    }
}
