package com.bridgelazbasicandfun;

import java.util.Scanner;

public class BasicAndFunctional {
	public static void main(String[] args)
    {
        //Create an object of scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  number 1 : ");
        int Num1=sc.nextInt();
        System.out.println("enter  number 2 : ");
        int Num2=sc.nextInt();

        QuotientRemainder(Num1,Num2);

    }


    static void QuotientRemainder(int Num1,int Num2)
    {
        int quotient = Num1/Num2;
        int remainder = Num1%Num2;

        System.out.println("the quotient is : " +quotient );
        System.out.println("the remainder is : "+remainder);
    }
}

