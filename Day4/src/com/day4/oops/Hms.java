package com.day4.oops;

import java.util.Scanner;
import java.io.*;

public class Hms {
    static Scanner scan = new Scanner(System.in);

    public static void main(final String[] args) {
        showMainMenu();
    }

    public static void showMainMenu(){
        System.out.println("--- MAIN MENU ---");
        System.out.println("1. Create Doctor");
        System.out.println("2. Update Doctor");
        System.out.println("3. Delete Doctor");
        System.out.println("4. Exit");

        System.out.print("Enter your Choice : ");

        int option = scan.nextInt();

        switch(option){
            case 1:
                createDoctor();
                break;
            case 2:
                updateDoctor();
                break;
            case 3:
                deleteDoctor();
                break;
            case 4: 
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option!");
                showMainMenu();
        }
     
    }
    public static void createDoctor(){
       
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Doctor Name: ");
        String newDoctor = myObj.nextLine();
        String newDoctorArray[] = newDoctor.split(" ");
       // newPet = scan.nextLine();
        System.out.println("Doctor Name is " + newDoctor);

        // use for READ
        for (int i = 0; i < newDoctorArray.length; i++){
            System.out.println(newDoctorArray[i]);
        }
        showMainMenu();
    }
    public static void updateDoctor() {

    }

    public static void deleteDoctor() {

    }
}