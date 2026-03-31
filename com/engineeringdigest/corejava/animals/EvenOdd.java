package com.engineeringdigest.corejava.animals;

import java.util.Scanner;
class EvenOdd
{
    public static void main(String[] args)
    {
        Scanner scn =  new Scanner(System.in);
        System.out.println("enter a number");
        int n=scn.nextInt();
        //if((n & 1)==0){
        //	System.out.println("Even");
        //}else{
        //	System.out.println("Odd");
        //}
        boolean even;
        System.out.println(n % 2 == 0 ? "even":"odd ");
    }
}
