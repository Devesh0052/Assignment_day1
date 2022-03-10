package com.day1assignment.app;
import java.util.*;

public class FactorialWithWhileLoop {
	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
    	System.out.print("Enter number- ");  
    	int num= sc.nextInt();
        
        long factorial = 1;
        int i = 1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}