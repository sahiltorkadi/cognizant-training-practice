import java.util.Scanner;

public class Fibinacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number=");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		 int t1 = 0, t2 = 1;
	        System.out.print("First " + num + " terms: ");
	        for (int i = 1; i <= num; ++i)
	        {
	            System.out.print(t1);
	            System.out.print("+");
	            int sum = t1 + t2;
	            t1 = t2;
	            t2 = sum;
	        }
	}

}
