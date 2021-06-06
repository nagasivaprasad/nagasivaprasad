package com.cg;

import java.util.Scanner;
import java.lang.Math;
public class L1E1
{
	
	public static double calculate(double  no)
	{	
		double sum=0;
		double Length= String.valueOf(no).length();
		while (no>0);
		{
		double r=(no%10);
		no=no/10;
		sum=(double) (sum+Math.pow(r, Length));
		
		}
		return sum;
	}
	
public static void main(String[] args) 
{
		
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextInt();
        scanner.close();
        
		System.out.println("The entered number is "+ num);
		double z=L1E1.calculate(num);;
		
		System.out.println("The addition of cubes of digits of a number is "+ z+".");
	}
}
