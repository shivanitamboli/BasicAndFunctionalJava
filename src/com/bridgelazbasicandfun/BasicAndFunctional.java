package com.bridgelazbasicandfun;

import java.util.Scanner;

public class BasicAndFunctional {
	public static void main(String[] args)
    {
        //Create an object of scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  number : ");
        int Num=sc.nextInt();
        primeFactors(Num);
    }
    static void primeFactors(int n)
    {
        System.out.print(" Prime Factors of " + n + " are : ");
        for (int i = 2; i < n; i++) {
            while (n % i == 0) {
                System.out.println(i + " ");
                n = n / i;
            }
        }
        if (n > 2) {
            System.out.println(n);

        }
    }
}

