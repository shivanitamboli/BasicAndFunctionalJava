package com.bridgelazbasicandfun;

import java.util.Scanner;

public class BasicAndFunctional {
	public static void main(String[] args)
    {
        //Create an object of scanner class
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Alphabet : ");
        char Alp = sc.next().charAt(0);
        vowelConsonant(Alp);
    }
    static void vowelConsonant(char Alp)
    {
        if (Alp == 'a' || Alp == 'e' || Alp == 'i' || Alp == 'o' || Alp == 'u' || Alp == 'A' || Alp == 'E' || Alp == 'I'
                || Alp == 'O' || Alp == 'U') {
            System.out.println(Alp + " is vowel");
        } else if ((Alp >= 'a' && Alp <= 'z') || (Alp >= 'A' && Alp <= 'Z')) {
            System.out.println(Alp + " is consonant");
        } else {
            System.out.println(Alp + " is not an alphabet");
        }
    }
    }


