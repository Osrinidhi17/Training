package com.task1.strarr;

/*Non-repeating */
public class ArrayAssignment8 {

	public static void main(String[] args) {

	    int result =0;
	    int []arr={3,4,5,3,4,5,6};
	    for(int i:arr)
	    {
	        result ^=i;
	    }

	    System.out.println("Result is "+result);
	}

}

/*for (int i=0; i < arr.length; i++) {
System.out.println("Result is : " + arr[i]);
}*/

