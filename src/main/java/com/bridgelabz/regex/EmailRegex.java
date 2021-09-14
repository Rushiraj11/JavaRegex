package com.bridgelabz.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailRegex {
    public static void main(String[] args) {

        String input = "abc";
        String regex = "^[a-c]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

    }
}