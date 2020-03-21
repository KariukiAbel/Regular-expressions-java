package com.nabesh;

public class ValidateInput {

    public static boolean validaterFirstName(String firstName){
        return firstName.matches("[A-Z][a-zA-Z]*");
    }

    public static boolean validateLastName(String lastName){
        return lastName.matches("[a-zA-Z]+([ '-][a-zA-Z]+)*");
    }

    public static boolean validateAddress(String address){
        return address.matches("//d+//s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    public static boolean validateCity(String city){
        return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }

    public static boolean validatePhoneNumber(String phone){
        return phone.matches("\\d{3}-[1-9]\\d{3}-[0-9]\\d{3}-[0-9]\\d{3}-[0-9]");
    }

}
