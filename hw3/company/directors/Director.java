package hw3.company.directors;

import hw3.company.workers.Worker;

public class Director extends Worker {

    public Director(String name, String role, String telephone, int salary, int age) {
        super(name, role, telephone, salary, age);
    }

    public static void salaryUp(Worker[] workers) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getRole() != "chiff") {
                workers[i].setSalary(workers[i].getSalary() + 500);
            }
        }
    }

}
