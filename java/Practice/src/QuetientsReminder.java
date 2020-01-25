import java.util.Scanner;
public class QuetientsReminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter 2 dividend & divisor=");
		Scanner sc1=new Scanner(System.in);
		float dividend=sc1.nextInt();
		Scanner sc2=new Scanner(System.in);
		float divisor=sc1.nextInt();
		float quotient = dividend / divisor;
        float remainder = dividend % divisor;
    	sc1.close();
		sc2.close();
		System.out.println("quotient="+quotient);
		System.out.println("remainder="+remainder);
	}

}
