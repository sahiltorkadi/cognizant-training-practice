package com.cts.ass;

import java.util.Scanner;

public class Count {
	public static void main(String[] args) {
		int n1,n2,i,sum;
		int n=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter uper and lower");
		n1=s.nextInt();
		n2=s.nextInt();
		for(i=n1;i<=n2;i++)
		{
			sum=i;
		
			while(sum>0)
			{
				int s1=sum%10;
				sum=sum%10;
				if(s1==1)
				{
					n=n+1;
				}
			}
		}
		System.out.println(n);
	}

}
