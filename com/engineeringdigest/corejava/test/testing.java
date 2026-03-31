package com.engineeringdigest.corejava.test;


class B
{
    public static void m1(){
        System.out.println("M1 starts");
        B.m2();
        System.out.println("M1 ends");
    }

    public static void m2(){
        System.out.println("M2 starts");
        System.out.println("M2 ends");
    }
    public static void main(String[] args)
    {
        System.out.println("Main start");
        B.m1();
        System.out.println("Main ends");
    }
}
