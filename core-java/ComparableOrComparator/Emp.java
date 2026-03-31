package ComparableOrComparator;

import java.util.*;

public class Emp implements Comparable<Emp> {

   String name;
   int id;
   double sal;
   private static int counter = 101;

   // Constructor
   public Emp(String name, double sal) {
      this.name = name;
      this.sal = sal;
      this.id = counter++;
   }

   // Natural ordering by name
   @Override
   public int compareTo(Emp e)
   {
      return Double.compare(this.id,e.id);
   }

   // Proper toString()
   @Override
   public String toString()
   {
      return "Emp{id=" + id + ", name='" + name + "', salary=" + sal + "}";
   }
}

// ---------------- Demo Class ----------------

class Demo {
   public static void main(String[] args) {

      List<Emp> empList = new ArrayList<>();

      empList.add(new Emp("Anis", 50000));
      empList.add(new Emp("Rahul", 60000));
      empList.add(new Emp("Amit", 45000));

      // Sorting using Comparable (natural ordering by name)
      Collections.sort(empList);

      // Printing objects → toString() is called automatically
      for (Emp e : empList) {
         System.out.println(e);
      }
   }
}
