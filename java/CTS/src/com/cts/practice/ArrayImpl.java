package com.cts.practice;

import java.util.Scanner;

public class ArrayImpl 
{
	public void Average()
	{
		 int n,avg;
	        System.out.println("Enter no. of elements you want in array:");
	        Scanner sc = new Scanner(System.in);
	        n = sc.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        int sum = 0;
	        for(int i=n; i < a.length ; i++)
	         sum = sum + a[i];
	        
	         double average = sum / a.length;
	         System.out.println("Average value of the array elements is : " + average); 
	        }
	
	
	public void Array2()
	{
		
	}
	public void Array3()
	{
		
	}
}
