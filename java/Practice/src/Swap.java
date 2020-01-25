import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number 1=");
		Scanner sc1 = new Scanner(System.in);
		int number1=sc1.nextInt();
		
		System.out.println("Enter the number 2=");
		Scanner sc2 = new Scanner(System.in);
		int number2=sc2.nextInt();
		
	    int temporary = number1;
	    number1 = number2;
	    number2 = temporary;
	    
	    System.out.println("********After swap********");
	    System.out.println("number 1 = " + number1);
	    System.out.println("number 2 = " + number2);
	    sc1.close();
	    sc2.close();
	}

}
