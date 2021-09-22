package com.bridgelazbasicandfun;

import java.util.Scanner;

public class BasicAndFunctional {
	static void sunOfThree(int n[]) {
        int count=0;
        for (int i = 0; i < n.length-2; i++)
        {
            for (int j = i+1; j < n.length-1; j++)
            {
                for (int k =j+1; k < n.length; k++)
                {
                    if(n[i]+n[j]+n[k]==0)
                    {
                        System.out.println(n[i]+" + "+n[j]+" + "+n[k]+" = " +0);

                        count++;
                    }
                }
            }

        }
        System.out.println("The number of triple count ="+count);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array length");
        int len=sc.nextInt();
        int n[]=new int[len];

        System.out.println("Enter the "+len+" Array ");
        for (int i = 0; i < n.length; i++)
        {
            n[i]=sc.nextInt();
        }
        sunOfThree(n);

        }
    }
    
    


