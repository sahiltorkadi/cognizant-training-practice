package com.cts.client;

import java.util.Scanner;

import com.cts.practice.ArrayImpl;
import com.cts.practice.Calculate;
import com.cts.practice.Pattern;

public class MyApp 
{

	public static void main(String[] args) 
	{
		
		System.out.println("1.Pattern");
		System.out.println("2.Calculate");
		System.out.println("3.ArrayImpl");
		System.out.println("Enter your choice=");
		Scanner sc= new Scanner(System.in);
		int ch = sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter number of rows you want");
			int rows = sc.nextInt();
			System.out.println("Your Pattern Is=");
			Pattern p1 = new Pattern();
			p1.pattern1(rows);
			System.out.println("");
			p1.pattern2(rows);
			break;
			
		
		case 2:
			System.out.println("Enter number=");
			int number = sc.nextInt();
			Calculate c1=new Calculate();
			c1.reverse(number);
			break;
			
		case 3:
			/*System.out.println("Enter number=");
			int numbers= sc.nextInt();*/
			ArrayImpl A1 = new ArrayImpl();
			A1.Average();
			break;
			
		default:
			System.out.println("Enter correct choice=");
		}
		
		sc.close();
				
	}

}
