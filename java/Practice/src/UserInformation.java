import java.util.Scanner;
public class UserInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name;
		int year;
		
		System.out.println("Enter the user Name=");
		Scanner sc1=new Scanner(System.in);
		Name=sc1.next();
		
		if(!Name.matches("[a-zA-Z_]+"))
		{
		    System.out.println("------------Invalid Input-------------");
		    System.out.println("please enter valid input");
		    
		}
				
		System.out.println("Enter the user Age=");
		Scanner sc2=new Scanner(System.in);
		year=sc2.nextInt();

		System.out.println("user Name=" +Name);
		System.out.println("user Age=" +year);
		
		sc1.close();   
		sc2.close();
	}

}
