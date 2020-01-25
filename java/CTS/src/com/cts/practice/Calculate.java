package com.cts.practice;

public class Calculate
{
	public void reverse(int Number)
	{
	int Reverse = 0;
	while(Number!=0)
	{
		Reverse=Reverse*10;
		Reverse=Reverse+ Number%10;
		Number=Number/10;
	}
	System.out.println("Reverse Number="+Reverse);
	}
	
	public void words(int Number)
	{
		
	}
	public void expand(int Number)
	{
		
	}
	
	
}



