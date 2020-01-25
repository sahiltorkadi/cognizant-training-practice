import java.util.Scanner;

public class SumOfNaturalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the last number=");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		int sum = 0;
        for(int i = 1; i <= num; ++i)
        {
            sum += i;
        }
        System.out.println("Sum = " + sum);
	}
}
