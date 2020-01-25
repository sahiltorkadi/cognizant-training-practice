import java.util.Scanner;

public class PossitiveNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the number=");
		Scanner sc = new Scanner(System.in);
		double number=sc.nextDouble();
		sc.close();
	        if (number < 0.0)
	            System.out.println(number +" is a negative number.");
	        else if ( number > 0.0)
	            System.out.println(number +" is a positive number.");
	        else
	            System.out.println(number +" is 0.");
	}

}
