package Test;// Online Java Compiler
// Use this editor to write, compile and run your Java code online

//
import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
////        int n=sc.nextInt();
//        int space=n-1;
//        int star=1;
//        for(int i=1;i<=n;i++)
//        {
////            int a=1;
//            for(int j=1;j<=space;j++)
//            {
//                System.out.print("_"+" ");
//            }
//            for(int j=1;j<=star;j++)
//            {
//                System.out.print("*"+" ");
//            }
//
//            System.out.println();
//            space--;
//            star+=2;

        int n = 5;

        for(int i = 1; i <=n; i++) {

            // leading spaces
            for(int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // columns
            for(int j = 1; j <= 2*i - 1; j++) {

                // shortcut rule
                if( i == n || j == 1 || j == 2*i - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();

        }
    }
}



// class Main {
//     public static void main(String[] args) {

//         for(int i=1;i<=4;i++)
//         {   if(i%2!=0)
//         { for(int j=1;j<=i;j++)
//             {
//                 System.out.print(j +" ");

//             }

//         }
//             if(i%2==0){
//           char c='A';
//             for(int j=1;j<=i;j++)
//             {
//                 System.out.print(c +" ");
//                  c++;
//             }
//             }

//         System.out.println();
//         }
//     }
// }