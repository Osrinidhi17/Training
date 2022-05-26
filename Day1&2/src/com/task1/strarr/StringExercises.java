package com.task1.strarr;

import java.util.Arrays;

public class StringExercises {
public static void main(String args[]) {
String string = "Hi Marc";
System.out.println("contains function Response : "+contains("hi srinidhi","hi"));

System.out.println("findSubstring function Response : "+findSubstring("hi srinidhi","i"));

System.out.println("splitIntoWords function Response : "+ Arrays.toString(splitIntoWords("hi srinidhi")));

String lastNChar = lastN(string, 4);
System.out.println("lastN function Response : " + lastNChar);

String firstNChar =firstN(string, 4);
System.out.println("firstN function Response : " + firstNChar);

int fm = findMarc(string);
System.out.println("findMarc function Response : "+fm);
}

public static int findMarc(String string) {
String match = "Marwc";
int indexOf = string.indexOf(match);
if( indexOf >= 0) {
return indexOf;
}
      return -1;
}

public static int findSubstring(String string,String substring) {
int indexOf = string.indexOf(substring);
if( indexOf >= 0) {
return indexOf;
}
return -2;
}

public static boolean contains(String main,String sub) {//sub shld be part of main
return main.matches("(.*)"+sub+"(.*)");//general expression means starts with any string 
}

public static String[] splitIntoWords(String string) {
String[] words = string.split(" ");
return words;
}

public static String firstFour(String string) {
return string.substring(0,4);
}

public static String firstN(String string,int n) {
return string.substring(0,n);
}

public static char lastFour(String string) {
  return string.charAt(string.length() - 1);
}

public static String lastN(String string, int n) {
return string.substring(string.length() - n);
}
}

