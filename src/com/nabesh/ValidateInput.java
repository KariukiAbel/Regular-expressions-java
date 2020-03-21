package com.nabesh;

public class ValidateInput {

    public static boolean validaterFirstName(String firstName){
        return firstName.matches("[A-Z][a-zA-Z]*");
    }

    public static boolean validateLastName(String lastName){
        return lastName.matches("[a-zA-Z]+([ '-][a-zA-Z]+)*");
    }


}
