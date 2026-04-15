package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Need to get user input
        System.out.print("Enter the phone serial number: ");
        int serialNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the phone model: ");
        String model = scanner.nextLine();

        System.out.print("Enter the phone carrier: ");
        String carrier = scanner.nextLine();

        System.out.print("Enter the phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter the owner: ");
        String owner = scanner.nextLine();

        CellPhone apple = new CellPhone(0, "", "", "", "");

        apple.setSerialNumber(serialNumber);
        apple.setModel(model);
        apple.setCarrier(carrier);
        apple.setPhoneNumber(phoneNumber);
        apple.setOwner(owner);

        System.out.println(apple.getSerialNumber());
        System.out.println(apple.getModel());
        System.out.println(apple.getCarrier());
        System.out.println(apple.getPhoneNumber());
        System.out.println(apple.getOwner());
    }
}
