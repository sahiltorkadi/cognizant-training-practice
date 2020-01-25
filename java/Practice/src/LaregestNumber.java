import java.util.Scanner;

public class LaregestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number 1=");
		Scanner sc1 = new Scanner(System.in);
		int number1=sc1.nextInt();
		
		System.out.println("Enter the number 2=");
		Scanner sc2 = new Scanner(System.in);
		int number2=sc2.nextInt();
		
		System.out.println("Enter the number 3=");
		Scanner sc3 = new Scanner(System.in);
		int number3=sc3.nextInt();
		
		
        if( number1 >= number2 && number1 >= number3)
            System.out.println(number1 + "is the largest number.");
        else if (number2 >= number1 && number2 >= number3)
            System.out.println(number2 + "is the largest number.");
        else
            System.out.println(number3 + "is the largest number.");
        sc1.close();
        sc2.close();
		sc3.close();
	}

}
