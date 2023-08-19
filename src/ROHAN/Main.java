package ROHAN;
import java.util.Scanner;
public class Main {
 public static void main(String[] args) {
	Account RohanAccount = new Account(1234,1000, "rohan", "Rohankadam053@gmail.com","7972736682");
	Scanner sc = new Scanner(System.in);
	 
	while(true)
	{
		System.out.println("1.DepositeMoney ");
		System.out.println("2.WithDrowMoney ");
		System.out.println("3.Exit");
		
		System.out.println("Enter your Choice : ");
		int choice =sc.nextInt();
		
		if(choice == 1)
		{
			System.out.println("Enter The Amount: ");
			RohanAccount.DepositeMoney(choice =sc.nextInt());
			System.out.println("Thank You Visit Again!");
			break;	
		}
		else if(choice == 2)
		{
			System.out.println("Enter The Amount: ");
			RohanAccount.WithDrowMoney(choice =sc.nextInt());
			System.out.println("Thank You Visit Again!");
			break;	
		}
		else
		{
			System.out.println("Thank You!");
			break;
		}	
	}
}
}
