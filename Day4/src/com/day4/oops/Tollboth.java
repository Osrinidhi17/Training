package com.day4.oops;

import java.util.Scanner;

public class Tollboth {
	    int car;
	    double amount;
	    public Tollboth(){
	        this.car = 0;
	        this.amount = 0;
	    }
	    public void payingCar(){
	        this.car++;
	        this.amount+=50;
	    }
	    public void nonPayingCar(){
	        this.car++;
	    }
	    public void display(){
	        System.out.println("Total Number of cars - "+car);
	        System.out.println("Total Amount - "+amount);
	    }
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        char c='y';
	        int ch;
	        Tollboth t = new Tollboth();
	        do{
	            System.out.println("1 for Paying");
	            System.out.println("2 for Non-Paying");
	            System.out.println("3 for display");
	            System.out.println("Enter choice");
	            ch = sc.nextInt();
	            switch (ch) {
	                case 1:
	                    t.payingCar(); 
	                    break;
	                case 2:
	                    t.nonPayingCar();
	                    break;
	                case 3:
	                    t.display();
	                    c='n';
	                    break;
	            }
	            if(c=='y'||c=='Y'){
	                //System.out.println("Do you want to continue");
	                //c = sc.next().charAt(0);
	            }
	        }while(c=='y'||c=='Y');
	    }
	}

