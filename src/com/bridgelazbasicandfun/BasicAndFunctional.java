package com.bridgelazbasicandfun;

import java.util.Scanner;

public class BasicAndFunctional {
	public static void main(String[] args)
    {
        //Create an object of scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Number : ");
        int Num1=sc.nextInt();
        evenOdd(Num1);
    }
    static void evenOdd(int Num)
    {
        if (Num%2 == 0){
            System.out.println("Even Number :" +Num);
        }else {
            System.out.println("Odd Number : " +Num);
        }
    }
    }


