package com.bridgelazbasicandfun;

import java.util.Scanner;

public class BasicAndFunctional {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int Num = sc.nextInt();
        powerOfNumber(Num);
    }
    public static void powerOfNumber(int input){
        int powerOfTwo = 1;
        if(input > 0 && input < 31) {
            for (int i = 1; i <= input; i++) {
                powerOfTwo = powerOfTwo * 2;
                System.out.println(2 + "to the Power " +i+ " : "+powerOfTwo);
            }
        }
        else{
            System.out.println("your overflows int datatype limit");
        }

    }
}
