package com.day4.oops;

import java.util.Scanner;

class Person {
private void calculateSalary(double netSalary, double tax) {
	
	
}
}

class Employee extends Person {
private double salary;
private double netSalary;

public double getSalary() {
return salary;
}
public void setSalary(double salary) {
this.salary = salary;
}
public double getNetSalary() {
return netSalary;
}
public void setNetSalary(double netSalary) {
this.netSalary = netSalary;
}
public void calculateSalary(double netSalary, double tax) {
double totalTax = (netSalary * tax / 100);
double salary = netSalary - totalTax;
this.salary = salary;
this.netSalary = netSalary;
}

@Override
public String toString() {
return "Employee [salary=" + salary + ", netSalary=" + netSalary + "]";
}
}
class SelfEmployed {
private double salary;
private double netSalary;

public double getSalary() {
return salary;
}
public void setSalary(double salary) {
this.salary = salary;
}
public double getNetSalary() {
return netSalary;
}
public void setNetSalary(double netSalary) {
this.netSalary = netSalary;
}
public void calculateSalary(double netSalary, double tax) {
double totalTax = (netSalary * tax / 100);
double salary = netSalary - totalTax;
this.salary = salary;
this.netSalary = netSalary;
}

@Override
public String toString() {
return "SelfEmployed [salary=" + salary + ", netSalary=" + netSalary + "]";
}
}
class UnEmployed {
private double salary;
private double netSalary;
public double getSalary() {
return salary;
}
public void setSalary(double salary) {
this.salary = salary;
}
public double getNetSalary() {
return netSalary;
}
public void setNetSalary(double netSalary) {
this.netSalary = netSalary;
}
public void calculateSalary(double netSalary, double tax) {
double totalTax = (netSalary * tax / 100);
double salary = netSalary - totalTax;
this.salary = salary;
this.netSalary = netSalary;
}
@Override
public String toString() {
return "UnEmployed [salary=" + salary + ", netSalary=" + netSalary + "]";
}
}
class SalaryCalc {
private static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
Employee employee = new Employee();
SelfEmployed selfEmployed = new SelfEmployed();
UnEmployed unEmployed = new UnEmployed();

employee.calculateSalary(350000, 12);
System.out.println(employee.toString());

selfEmployed.calculateSalary(5000000, 30);
System.out.println(selfEmployed.toString());

unEmployed.calculateSalary(35000, 10);
System.out.println(unEmployed.toString());
}
}

