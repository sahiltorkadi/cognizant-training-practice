package com.cts.assignment1;
import java.util.Scanner;
public class InputOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your name=");
		Scanner sc1 = new Scanner(System.in);
		String name=sc1.next();
		System.out.println("Enter your year of graduation=");
		Scanner sc2 = new Scanner(System.in);
		int year=sc2.nextInt();
		System.out.print("My name is " +name );
		System.out.printf(" and I'll graduate in " +year);
		
	sc1.close();
	sc2.close();	
	}

}
