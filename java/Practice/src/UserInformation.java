import java.util.Scanner;
public class UserInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name;
		int Age;
		
		System.out.println("Enter the user Name=");
		Scanner sc1=new Scanner(System.in);
		Name=sc1.next();
		if (!Name.matches("[a-zA-Z_]+")) {
		    System.out.println("Invalid name");
		}
				
		System.out.println("Enter the user Age=");
		Scanner sc2=new Scanner(System.in);
		Age=sc2.nextInt();
		if (!Age.matches("[0-9]+")) {
		System.out.println("Invalid number");
		
		System.out.println("user Name="+Name);
		System.out.println("user Age="+Age);
		
		sc1.close();   
		sc2.close();
	}

}
