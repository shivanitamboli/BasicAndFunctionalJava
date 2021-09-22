package com.bridgelazbasicandfun;

import java.util.Scanner;

public class BasicAndFunctional {
	public static void main(String[] args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a :");
        a = sc.nextInt();
        System.out.println("Enter value b :");
        b = sc.nextInt();
        System.out.println("Enter value c :");
        c = sc.nextInt();
        quadraticCal(a,b,c);
    }
    public static void quadraticCal(double a, double b, double c){
        // print the roots of quadratic equation
        double delta = (b * b) - (4 * a * c);
        if (delta > 0.0){
            double r1 = (-b + Math.sqrt(delta)) / (2 * a);
            double r2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Root 1 is : " +r1);
            System.out.println("Root 2 is : " +r2);
        }
    }
    }

        
    
    
    


