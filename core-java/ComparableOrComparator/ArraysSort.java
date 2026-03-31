package ComparableOrComparator;
import java.util.Arrays;
public class ArraysSort {
    static  void sort(Object[] a)
    {
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length ; j++) {
                Comparable c1 = (Comparable)a[i];
                Comparable c2 = (Comparable)a[j];
                if (c1.compareTo(c2)>0)
                {
                    Object temp = a[i];
                    a[i]= a[j];
                    a[j]=temp;
                }
            }
        }

    }
    static void main() {
        String[] a = {"java","python","angular","html","css"};
        Arrays.sort(a);
        for (String s : a)
        {
            System.out.println(s);
        }
    }
}
