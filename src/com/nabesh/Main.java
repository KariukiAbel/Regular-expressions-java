package com.nabesh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String fname = scanner.nextLine();
        System.out.println("Enter last name: ");
        String lname = scanner.nextLine();
        System.out.println("Enter Address: ");
        String address = scanner.nextLine();
        System.out.println("Enter city or town: ");
        String cityTown = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

        //validation output
        System.out.println("\n validation results");
        if (!ValidateInput.validaterFirstName(fname)){
            System.out.println("Invalid first name");
        }
        else if(!ValidateInput.validateLastName(lname)){
            System.out.println("Invalid last name");
        }
        else if (!ValidateInput.validateAddress(address)){
            System.out.println("Invalid address");
        }
        else if(!ValidateInput.validateCity(cityTown)){
            System.out.println("Invalid city or town!");
        }
        else if (!ValidateInput.validatePhoneNumber(phoneNumber)){
            System.out.println("Invalid phone number");
        }else{
            System.out.println("Valid input. Thank you");
        }

    }
}
