package com.engineeringdigest.corejava;

class Constructor {
}
class C {
     C(int i){
         System.out.println("anis");
     }

}
class Test2{
    static void main(String[] args) {
        new Constructor();
        new C(10);

    }
}