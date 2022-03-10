package com.day1assignment.app;
import java.util.*;

class MaximumNumber {
	  
    
    public static void main(String args[])
    {
    	int max;
    	Scanner sc= new Scanner(System.in);
    	System.out.print("Enter first number- ");  
    	int a= sc.nextInt();  
    	System.out.print("Enter second number- ");  
    	int b= sc.nextInt();  
    	System.out.print("Enter third number- ");  
    	int c= sc.nextInt();  
  
        
        max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
  
        
        System.out.println("Maximum number among " + a
                           + ", " + b + " and " + c + " is "
                           + max);
    }
}