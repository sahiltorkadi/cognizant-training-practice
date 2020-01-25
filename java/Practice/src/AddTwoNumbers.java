import java.util.Scanner;

public class AddTwoNumbers {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number 1=");
		Scanner sc1 = new Scanner(System.in);
		int number1=sc1.nextInt();
		System.out.println("Enter the number 2=");
		Scanner sc2 = new Scanner(System.in);
		int number2=sc2.nextInt();
		int number=number1+number2;
		System.out.println("the sum is="+number);		
        sc1.close();
        sc2.close();
		
	}

}
