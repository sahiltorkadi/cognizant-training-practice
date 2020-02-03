import java.util.Scanner;

public class Quiz 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		        System.out.println("Do you want to play quiz??(Y/N)=");
				Scanner sc1 = new Scanner(System.in);
				String ans=sc1.next();
				 if (ans.equalsIgnoreCase("Y"))
				{
					System.out.println("Q.1) What is the capital of India???");
			        System.out.println("1) Delhi");
					System.out.println("2) Mumbai");
					System.out.println("3) Chennai");
					System.out.printf("ANSWER=");
					int ch=sc1.nextInt();
					
				    
				    	switch (ch)
				    {
				      case 1:
				        System.out.println("That's right!");
				        break;
				      case 2:
				        System.out.println("Wrong!");
				        break;
				      case 3:
				        System.out.println("Wrong!");
				        break;
				      default:
				    	 System.out.println("***Invalid choice please enter valid choice***");
				    	 break;
				    	 
				   	    	 
				    }
					
					 System.out.println("Q.2) Can you store the value \"dog\" in a variable of type int???");
					 System.out.println("1) Yes");
					 System.out.println("2) No");
					 System.out.printf("ANSWER="); 
				     int choice=sc1.nextInt();
						
					    
					    	switch (choice)
					    {
					      case 1:
					        System.out.println("Sorry, \"dog\" is a string. ints can only store numbers.");
					        break;
					      case 2:
					        System.out.println("Thats Correct!");
					        break;
					      default:
					    	 System.out.println("***Invalid choice please enter valid choice***");
					    	 break;
					    	 		    	 
					    }
						
						System.out.println("Q.3) What is the result of 9+9/3?");
						System.out.println("1) 6");
						System.out.println("2) 12");
						System.out.println("3) 15/3");
						System.out.printf("ANSWER=");
						int ch1=sc1.nextInt();
						
					    
					    switch (ch1)
					    {
					      case 1:
					        System.out.println("Thats Correct!");
					        break;
					      case 2:
					        System.out.println("wrong!!");
					        break;
					      case 3:
						    System.out.println("wrong!!");
						    break;
					      default:
					    	 System.out.println("***Invalid choice please enter valid choice***");
					    	 break;
					    	 		    	 
					   }
				}
				
				 else if(ans.equalsIgnoreCase("N"))
				 {
					 System.out.println("OK!! User does not want to play quiz.");					
				 }	
				 
				else
					{
						 System.out.println("Try Again With (Y/N) only !");					
					}	
				 sc1.close();
				
				 
	}
	
}
	


