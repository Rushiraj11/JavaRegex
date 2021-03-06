package com.bridgelabz.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailRegex {
    public static void main(String[] args) {

        String input = "abc.xyz@bridgelabz.co";
       String regex = "^[a-c]+([.+-_][0-9a-z]+)*@[bridgelabz]{10}+.[co]{2}$"; // : < > / ?
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

    }
}