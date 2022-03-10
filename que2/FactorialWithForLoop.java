package com.day1assignment.app;
import java.util.*;

public class FactorialWithForLoop {

    public static void main(String[] args) {

    	Scanner sc= new Scanner(System.in);
    	System.out.print("Enter number- ");  
    	int num= sc.nextInt();
        
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}