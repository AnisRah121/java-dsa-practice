package ComparableOrComparator;

import java.util.Arrays;
import java.util.Comparator;

class SalCompare {
    double salary;

    public SalCompare(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Salary: " + salary;
    }
}

// Comparator based on salary
class SalaryComparator implements Comparator<SalCompare> {

    @Override
    public int compare(SalCompare e1, SalCompare e2) {
        return Double.compare(e1.salary, e2.salary);
    }
}

public class EmpSalarySort {
    public static void main(String[] args) {

        SalCompare[] empArr = {
                new SalCompare(60000),
                new SalCompare(45000),
                new SalCompare(50000)
        };

        Arrays.sort(empArr, new SalaryComparator());

        for (SalCompare e : empArr) {
            System.out.println(e);
        }
    }
}
