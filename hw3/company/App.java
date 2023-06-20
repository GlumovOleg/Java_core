package hw3.company;

import java.util.Arrays;

import hw3.company.comparators.SortAge;
import hw3.company.comparators.SortSalary;
import hw3.company.directors.Director;
import hw3.company.workers.Worker;

public class App {
    public static void main(String[] args) {

        Worker worker1 = new Worker("Ivan", "slave", "89544254667", 500, 35);
        Worker worker2 = new Worker("Artur", "slave", "89544254667", 800, 38);
        Worker worker3 = new Worker("Ruslan", "slave", "89544254667", 450, 32);
        Worker worker4 = new Worker("Dima", "slave", "89544254667", 900, 27);
        Director director = new Director("Oleg", "chiff", "89425435447", 1100, 39);

        Worker[] workers = new Worker[] { worker1, worker2, worker3, worker4, director };

        System.out.println("before up salary");
        for (Worker worker : workers) {
            System.out.println(worker);
        }

        Director.salaryUp(workers);

        System.out.println("after up salary");
        for (Worker worker : workers) {
            System.out.println(worker);
        }


        Arrays.sort(workers, SortAge.ageComparator);
        System.out.println("SortAge");
        for (Worker worker : workers) {
            System.out.println(worker);
        }

        Arrays.sort(workers, SortSalary.salaryComparator);
        System.out.println("SortSalary");
        for (Worker worker : workers) {
            System.out.println(worker);
        }



    }
}
