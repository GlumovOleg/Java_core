package hw3.company.comparators;

import java.util.Comparator;

import hw3.company.workers.Worker;

public class SortSalary implements Comparator<Worker> {

    public static Comparator<Worker> salaryComparator = new Comparator<Worker>() {

        @Override
        public int compare(Worker o1, Worker o2) {
            return o1.getSalary() - o2.getSalary();
        }
    };

    @Override
    public int compare(Worker o1, Worker o2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compare'");
    }
    
}
