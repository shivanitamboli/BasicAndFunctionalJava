package com.bridgelazbasicandfun;

import java.util.Scanner;

public class BasicAndFunctional {
		public static void main(String[] args)
	    {
	        //create object of Scanner class
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter any number : ");
	        int Num=sc.nextInt();
	        harmonicNumber(Num);

	    }

	    static void harmonicNumber(int n)
	    { double sumHr=0;
	        if(n!=0)
	        {
	            for (int i = 1; i <= n; i++)
	            {
	                sumHr=sumHr+(1.0/i);
	                if(i==1)
	                {
	                    System.out.print("1/"+i+" ");
	                }
	                else
	                {
	                    System.out.print(" + "+"1/"+i);
	                }


	            }
	            System.out.println();
	            System.out.println("The number harmonic value is = "+ sumHr);
	        }
	        else
	        {
	            System.out.println("Number greater than zero");
	        }
	    }

    }

