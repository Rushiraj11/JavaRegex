package com.bridgelabz.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PinCodeRegex {
    public static void main(String[] args) {
        System.out.println("Welcome to JavaRegex program");

       // String input = "400088";
       // String input = "A400088"; // UC2 validation
        String input = "400088B"; // UC3 validation
        String regex = "^[1-9]{1}[0-9]{5}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }


    }

}
