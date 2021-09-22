package com.bridgelazbasicandfun;

import java.util.Scanner;

public class BasicAndFunctional {
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*
        *row and cols size
        * using Scanner object class
         */
        System.out.println("Enter The Row Size : ");
        int M = sc.nextInt();
        System.out.println("Enter The Column Size : ");
        int N = sc.nextInt();
        getArray(M,N);
    }


    static void getArray(int X, int Y){
        /*
        *enter input in array
        * and store it
         */
        int [] [] arr = new int[X][Y];
        for (int i=0; i<X;i++){
            for (int j=0; j<Y;j++){
                System.out.print("Enter value : "+i+" "+j+" : ");      // for printing every position
                arr[i][j]= sc.nextInt();
            }
        }
        sc.close();
        for (int i=0; i<X;i++) {
            for (int j = 0; j < Y; j++) {
                System.out.print(arr[i][j] + " "); //display array in 2D
            }
            System.out.println(" ");
        }
    }
    }
    


