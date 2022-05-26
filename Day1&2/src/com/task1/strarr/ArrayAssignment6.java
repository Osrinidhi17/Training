package com.task1.strarr;

/*one array into another array in reverse order*/
public class ArrayAssignment6 {
       public static void main(String[] args) {  
	        int [] arr = new int [] {1, 2, 3, 4, 5}; 
	        int arr1[] = new int[arr.length]; 
	        
	        System.out.println("Original array: ");  
	        for (int i = 0; i < arr.length; i++) {  
	            System.out.print(arr[i] + " ");  
	        }  
	        System.out.println();  
	            
	        for (int i = 0; i < arr1.length; i++) {     
	            arr1[i] = arr[i];     
	        }    
	        System.out.println("Elements of new array: ");    
	        for (int i = 0; i < arr1.length; i++) {     
	        System.out.print(arr1[i] + " ");  
	        }
	        System.out.println();  
	        System.out.println("Array in reverse order: ");  
	        for (int i = arr.length-1; i >= 0; i--) {  
	            System.out.print(arr[i] + " ");    
	        }  
	    }  
	}
