package com.day4.oops;

	class Int{
	    private int sum;
	    public Int(){
	        sum=0;
	    }
	    public Int(int a){
	        sum=a;
	    }
	    public void getSum(){
	        System.out.println(sum);
	    }
	    public void addNumber(Int i,Int j){
	        sum = i.sum + j.sum;
	    }
	}
	public class CheckInt{
	    public static void main(String[] args){
	        Int a = new Int(4);
	        Int b = new Int(8);
	        Int c = new Int();
	        c.addNumber(a,b);
	        c.getSum();
	    }
	}


