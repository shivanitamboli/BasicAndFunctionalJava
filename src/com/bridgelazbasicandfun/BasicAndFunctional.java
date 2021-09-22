package com.bridgelazbasicandfun;

import java.util.Scanner;

public class BasicAndFunctional {
	public static void main(String[] args)
    {
        //Create an object of scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  Value 1 and Value 2 : ");
        int Num1=sc.nextInt();
        int Num2=sc.nextInt();

        QuotientRemainder(Num1,Num2);
    }
    static void QuotientRemainder(int a,int b)
    {
        int t;
        t=a;
        a=b;
        b=t;
        System.out.println();
        System.out.println("after swapping " +a+" " +b);
    }

    }


