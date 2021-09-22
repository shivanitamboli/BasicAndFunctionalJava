package com.bridgelazbasicandfun;

import java.util.Scanner;

public class BasicAndFunctional {
	public static void main(String[] args) {
        double v, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        t = sc.nextDouble();
        System.out.println("Enter wind speed");
        v = sc.nextDouble();
        windchill(t, v);
        sc.close();
    }

    public static void windchill(double t, double v) {
        if (t > 50 || v < 3 || v > 120)
            System.out.println("Invalid Input Please " +
                    "Enter tem below 50 and wind above 3 and below 120");
        else {
            double w = 35.74 + 0.6215 * t + ((0.4275 * t - 35.75) * Math.pow(v, 0.16));
            System.out.println("temperature :" + t );
            System.out.println("Wind speed :" +v);
            System.out.println("Wind Chill :" +w);
        }
    }
    }

        
    
    
    


