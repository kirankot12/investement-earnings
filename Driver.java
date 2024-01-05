package investementEarnings;
import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter your buying price: ");
		double buyingPrice = scan.nextDouble();
		int day = 1;
		double closingPrice = 0.1;
		while (true) {
			System.out.println(" enter your closing price for day" + day + 
					" (Any negative value to leave: ) ");
			closingPrice = scan.nextDouble();
			if (closingPrice < 0.0) break;
			double earnings = closingPrice - buyingPrice;
			if (earnings > 0) {
				System.out.println("After day " + day + " you earned " 
				+ earnings + " per share");
				
			}
			else if (earnings < 0.0) {
				System.out.println("After day " + day + " you earned" 
						+ (-earnings) + " per share");
			}
			else {
				System.out.println("after day" + day + ", You have " + "no earnings shared");
				
				
			}
			day += 1;
	}
		scan.close();}}

