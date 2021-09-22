package com.bridgelazbasicandfun;

import java.util.Scanner;

public class BasicAndFunctional {

	public static void main(String[] args) {
		//creating Scanner object class
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of time coin flip :");
        int numberOfFlip = sc.nextInt();
        //Ensure it is a positive integer.
        if (numberOfFlip <= 0)
            System.out.println("Please Enter Positive Number");
        else
            flipCoin(numberOfFlip);
    }
    public static void flipCoin(int numberOfFlip){
        //initialize
        int head = 0 , tail = 0;
        double headPercent = 0, tailPercent = 0;

        for (int i = 0; i < numberOfFlip; i++){
            //using random Math to generating number
            if (Math.random()<0.5)
                head++;
            else
                tail++;
        }
        System.out.println("Head is :: " +head);
        System.out.println("Tail is :: " +tail);
        //checking percentage of head and tail
        headPercent=(head*100)/numberOfFlip;
        tailPercent=(tail*100)/numberOfFlip;
        //print percentage of head and tail
        System.out.println("percent of head is :: " +headPercent+ "percent of tail is :: " +tailPercent);

	}

}
