package com.bridgelabz.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationRegex {
    public static void main(String[] args) {
        firstNameName();
        lastName();
        emailId();
    }
        public static void firstNameName(){
            String Firstnameinput = "Rushiraj";
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Firstnameinput);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

        public static void lastName(){
            String Lastnameinput = "Ghatge";
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern1 = Pattern.compile(regex);
            Matcher matcher = pattern1.matcher(Lastnameinput);
            if (matcher.matches()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }

        public static void emailId(){
            String input = "abc.xyz@bl.co.in";
            String regex = "^[a-c]+([.+-_][0-9a-z]+)*@[bl]{2}+.[co]{2}+.[a-z]{2}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }

    }
}


