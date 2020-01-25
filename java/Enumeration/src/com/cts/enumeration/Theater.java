package com.cts.enumeration;

import java.util.Scanner;

public enum Theater
{
	DIMOND,
	GOLD,
	SILVER;

	public void getRate() 
		{
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
			System.out.println("1.Dimond seat");
			System.out.println("2.Gold seat");
			System.out.println("3.Silver seat");
			 switch (ch) 
		        { 
		        case 1: 
		            System.out.println("100"); 
		            break; 
		        case 2: 
		            System.out.println("80"); 
		            break; 
		        case 3: 
		            System.out.println("60"); 
		            break; 
		        default: 
		            System.out.println("Invalid choice"); 
		            break; 
		        }
			 sc.close();
					
		} 
}
	