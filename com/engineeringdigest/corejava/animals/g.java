package com.engineeringdigest.corejava.animals;

//import java.util.Scanner;
//class g
//{
//    public static void main(String[] args)
//    {
//        Scanner scn =  new Scanner(System.in);
//        System.out.println("enter a string");
//        String s1=scn.nextLine();
//        System.out.println("s1="+s1);


//            Scanner scn =  new Scanner(System.in);
//            System.out.println("enter 1st number");
//            int s1=scn.nextInt();
//            System.out.println("enter 2nd number");
//            int s2=scn.nextInt();
//            System.out.println("Sum="s1+s2);
//        Scanner scn =  new Scanner(System.in);
//        System.out.println("enter a number");
//        int n=scn.nextInt();
//        //if((n & 1)==0){
//        //	System.out.println("Even");
//        //}else{
//        //	System.out.println("Odd");
//        //}
//        boolean even;
//        System.out.println(n % 2 == 0 ? "even":"odd ")

//                Scanner scn = new Scanner(System.in);
//                System.out.println("Enter a number:");
//                int n = scn.nextInt();
//                int fact = 1;
//
//                for (int i = 1; i <= n; i++) {
//                    fact = fact * i; // multiply current number
//                }
//
//                System.out.println("Factorial of " + n + " is " + fact);
        import java.util.Scanner;
        class FibbonaccyUL
        {
            public static void main(String[] args)
            {
                //Scanner scn =  new Scanner(System.in);
                //System.out.println("enter the number");
                //int n=scn.nextInt();
                int l=20;
                int u=100;
                int a=0;
                int b=1;
                int sum=0;
                while (a<u)
                {
                    if (a>l)
                    {
                        System.out.println(a+"");
                        sum=a+b;
                        a=b;
                        b=sum;
                    }


                }
            }
        }




//    }
//
//
//
//
//}
