package com.cts.practice;

 
public class Pattern
{
  public void pattern1(int rows)
  {
   int i,j;
    for (i = 1; i <= rows; i++) 
    {
	  
    	for ( j = i; j <= rows; j++)
    	{
    		System.out.printf(" ");
    	}
    	for (j = 1; j <= i; j++)
    	{
    		System.out.printf("%d",j);
    	}
             
    	for (j = i-1; j >= 1; j--)
    	{
    		System.out.printf("%d",j);
    	}
           
    	System.out.println();
      }
   }
  
  public void pattern2(int rows)
  {
	  int n = 5;
	  for (int i = 0; i < n; i++) {
		  int number = 1;
		  System.out.printf("%" + (n - i) * 2 + "s", "");
		  for (int j = 0; j <= i; j++)
		  {
			  System.out.printf("%4d", number);
			  number = number * (i - j) / (j + 1);
		  }
		  System.out.println();
	  }
	     
  }
  
  public class Words
  	{
	  
  	}
  
  public class Expand
	{
	  
	}
  }
	    



