package com.task1.strarr;

import java.util.Arrays;
import java.util.Scanner;
/*unsorted separting negative and postive numbers*/
public class ArrayAssignment4 {

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N :");
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter the "+n+" elements :");
		for(int i=0;i<n;i++)
		{
		arr[i] = sc.nextInt();
		}
		seperate(arr);
		sc.close();
		}
		public static void seperate(int[] arr)
		{
		int pcount = 0;
		int ncount = 0;
		int[] positive = null;
		int[] negative = null;
		for(int i : arr)
		{
		if(i > 0)
		++pcount;
		else
		++ncount;
		}
		positive = new int[pcount];
		negative = new int[ncount];
		int i=0,j=0;
		for(int num : arr)
		{
		if(num>0)
		{
		positive[i++] = num;
		}
		else
		{
		negative[j++] = num;
		}
		}
		System.out.print("{");
		System.out.print(Arrays.toString(positive));
		System.out.print(Arrays.toString(negative));
		System.out.print("}");
		}
		}
