package com.bridgelazbasicandfun;

import java.util.Scanner;

public class BasicAndFunctional {
	public static void main(String[] args) {
        /* that takes two integer command-line
         * arguments x and y
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer for x");
        int x = sc.nextInt();
        System.out.println("Enter the integer for x");
        int y = sc.nextInt();
        calDistance(x, y);
        sc.close();
    }

    private static void calDistance(int x, int y) {
        /* prints the Euclidean distance from the point (x, y) to
         * the origin (0, 0). The formulae to calculate
         * distance = sqrt(x*x + y*y). Use Math.power function
         */
        double res = (Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2))));
        System.out.println("The Euclidean distance is: " + res);
    }

        }
    
    
    


