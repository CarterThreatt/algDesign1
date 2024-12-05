// Carter T. Threatt
import java.util.Scanner;
public class Lab5 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter how much you will spend on choclate from the vending machine: ");
		
		int spend = key.nextInt();
		
		if(spend < 0)
		{
			System.out.println("Invalid Entry.");
			System.exit(0);
		}
		//Data Validation
		
		int coupons = spend; //1 coupon per dollar
		int bars = spend; //1 bar per dollar
		
		while(coupons >= 6)
		{
			int extra_bars = coupons/6; 
			bars += extra_bars;
            coupons = coupons % 6 + extra_bars; //Remaining coupons
		}
		
		System.out.println("You can buy "+bars+" choclate bars, and will have "+coupons+" coupons left over.");
	}

}
