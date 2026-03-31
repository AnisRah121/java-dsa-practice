package com.engineeringdigest.corejava.Interfaces;

public class Payment implements Men,Women,Kids{
    @Override
    public void chaddi() {
        System.out.println("pampers");
    }

    @Override
    public void casuals() {
        System.out.println("casuals done");
    }

    @Override
    public void login() {

        System.out.println("Login done");

    }

    @Override
    public void traditional() {
        System.out.println("Traditonal done");

    }
}
