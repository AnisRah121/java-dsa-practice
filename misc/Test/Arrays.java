package Test;


import java.util.ArrayList;
import java.util.Scanner;

public class Arrays {
    //    ArrayList <Integer> a = new ArrayList();
//    a.add(10);
//    a.add(20);
    static void main() {


//    int a =10;
//    Integer i = new Integer(a);
//
//    int b = 20;
//    Integer j = b;
//
//    Integer k = new Integer(30);
//    int c = k;
//
//    Integer l = 40;
//    int d= l;
//
//    System.out.println(k);
//    System.out.println(c);
//    System.out.println(l);
//    System.out.println(d);


//    //array declaration
//    int [] a ;
//    //arra creation
//    a=new int[3];
//    //array initialization
//    a[0]=10;
//    a[1]=20;
//    a[2]=30;
//    //array fetching
//    System.out.println(a[0]);
//    System.out.println(a[1]);
//    System.out.println(a[2]);

//    System.out.println(a);
//    System.out.println(i);
//    System.out.println(b);
//    System.out.println(j);
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int length= sc.nextInt();
        int [] a = new int[length];

        //taking input elements
        for (int i=0;i<a.length;i++)
        {
            System.out.println("enter the element");
            a[i]=sc.nextInt();
        }
        // display the array element
        for (int i =0 ; i<a.length;i++)
        {
            System.out.println(a[i]);
        }
        System.out.println("reverse");
        for (int i =a.length-1 ; i>=0;i--)
        {
            System.out.println(a[i]);
        }


    }
}