package hw3.company.comparators;

import java.util.Comparator;

import hw3.company.workers.Worker;

public class SortAge implements Comparator<Worker> {

    public static Comparator<Worker> ageComparator = new Comparator<Worker>() {

        @Override
        public int compare(Worker o1, Worker o2) {
            return o1.getAge() - o2.getAge();
        }
    };

    @Override
    public int compare(Worker o1, Worker o2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compare'");
    }
    
}
