package com.mapper.app;
import java.util.*;

public class CityMapper {
	
	public String getCityByCode(int i) {
		
		if(i==1) {
			return "DELHI";
		}
		else if(i==2) {
			return "NOIDA";
		}
		else if(i==3) {
			return "GURGAON";
		}
		else if(i==4) {
			return "BANGALORE";
		}
		else {
			return "INVALIDCODE";
		}
		
	}
	
	public static void main(String[] args) {
		CityMapper c = new CityMapper();
		Scanner sc= new Scanner(System.in);
    	System.out.print("Enter number- ");  
    	int i= sc.nextInt();
    	
    	System.out.println(c.getCityByCode(i));
    	
    	
		
		
	}
}
