package com.engineeringdigest.corejava.animals;

class Demo {
 static int b =10;

    public static void main() {
        System.out.println("m1");
        System.out.println(Demo.b);
        Demo.main(1);
    }

    static void main(int a) {
        System.out.println("m2");

    }

}




