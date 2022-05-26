package com.task1.strarr;

import java.util.*;
import java.io.*;
public class StringAssignment3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String fname = sc.next();
        System.out.println("Enter Second Name");
        String lname = sc.next();
        System.out.println("Enter Year of birth");
        String yob = sc.next();
        
        String pass = generatePassword(fname,lname,yob);
        System.out.println("Generated Password - " +pass.toLowerCase());
        sc.close();
    }
    public static String generatePassword(String firstName,String lastName,String yob){
        String password = firstName.substring(1,4) + lastName.substring(1,4) + yob.substring(2,4);
        return password;
    }
}