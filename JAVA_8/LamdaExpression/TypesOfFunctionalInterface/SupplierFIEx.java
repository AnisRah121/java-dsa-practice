package JAVA_8.LamdaExpression.TypesOfFunctionalInterface;

import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierFIEx {
    int i ;

    public SupplierFIEx(int i) {
        this.i = i;
    }

    static void main() {
        Supplier<SupplierFIEx> sp =()-> new SupplierFIEx(new Scanner(System.in).nextInt());

        SupplierFIEx a1 =sp.get();
        SupplierFIEx a2 =sp.get();
        System.out.println(a1.i);
        System.out.println(a2.i);
    }
}
