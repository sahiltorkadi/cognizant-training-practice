import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enter the year=");
		Scanner sc = new Scanner(System.in);
		int year=sc.nextInt();
		sc.close();
        if(year % 4 == 0)
        {
        	 System.out.println(year +" is a leap year.");
        }
         else
         {
            System.out.println(year +" is not a leap year.");
         }
	}

}
