import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number=");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
	        for(int i = 1; i <= 10; ++i)
	        {
	            System.out.printf("%d * %d = %d \n", num, i, num * i);
	        }
		
	}

}
