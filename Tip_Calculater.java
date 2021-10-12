import java.util.Scanner;
public class Tip_Calculater {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n\tWelcome to Tip Calculator!!");
		System.out.println("\nEnter total amount of the bill.. :");int bill = scan.nextInt();
		System.out.println("How much tip would you like to give? ");int tip = scan.nextInt();
		System.out.println("How many people to split the bill? ");int person = scan.nextInt();
		int total = bill + tip;
		int per_person = total/person;
		System.out.println("Total bill is : ₹"+total);
		System.out.println("Each should give : ₹"+per_person);
	}
}
