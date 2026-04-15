package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {
    CellPhone apple = new CellPhone(0, "", "", "", "");
        System.out.println(apple.getSerialNumber());
        System.out.println(apple.getModel());
        System.out.println(apple.getCarrier());
        System.out.println(apple.getPhoneNumber());
        System.out.println(apple.getOwner());
    }
}
