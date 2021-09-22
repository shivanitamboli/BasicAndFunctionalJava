package com.bridgelazbasicandfun;

import java.util.Scanner;

public class BasicAndFunctional {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Year Here : ");
	    int Year = sc.nextInt();
	    //Ensure it is a 4 digit number
	    if(Year > 999 && Year < 9999)
	        checkLeapYear(Year);
	    else
	        System.out.println("Enter 4 digit Year");

	}
	    public static void checkLeapYear(int Year){
	        // Checking condition of leap year
	        if ((Year % 4 == 0) && (Year % 100 != 0) || (Year %400 == 0 ) )
	            System.out.println(+Year+ " is leap year ");
	        else
	            System.out.println(+Year+ " is not leap year");

	}

}
