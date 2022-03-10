package com.staticcheck.app;

public class StaticCheck {

	
	   private static double salary;

	   
	   public static final String DEPARTMENT = "Development ";

	   public static void main(String args[]) {
	      salary = 1000;
	      
	      StaticCheck2 s = new StaticCheck2();
	      System.out.println(DEPARTMENT + "average salary:" + StaticCheck2.salary2);
	      
	      System.out.println(s.methodCheck1());
	      
	      System.out.println(s.methodCheck2());
	   }
}
