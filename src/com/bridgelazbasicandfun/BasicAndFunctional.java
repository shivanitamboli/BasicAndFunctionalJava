package com.bridgelazbasicandfun;

import java.util.Scanner;

public class BasicAndFunctional {
	public static void main(String[] args)
    {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number:");
        a = input.nextInt();
        System.out.print("Enter the second number:");
        b = input.nextInt();
        System.out.print("Enter the third number:");
        c = input.nextInt();
        if(a > b && a >c)
        {
            System.out.println("Largest number is:"+a);
        }
        else if(a > c)
        {
            System.out.println("Largest number is:"+b);
        }
        else
        {
            System.out.println("Largest number is:"+c);
        }
    }
    }


