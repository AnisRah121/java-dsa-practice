package com.engineeringdigest.corejava.Interfaces;

public class Test {
    static void main() {
//     A a   = new C();
//     a.add();
//     B b   =new C();
//     b.add();
//    }

        Myntra my = new Payment();
        my.login();


        Men m = new Payment();
        m.login();
        m.casuals();

        Women w = new Payment();
        w.login();
        w.traditional();

        Kids k = new Payment();
        k.login();
        k.chaddi();
    }
}
