package area;

import java.util.Scanner;

public class AreaMain {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String keepGoing = "";
		int count = 0;
		
		System.out.println("==========================================================");
		System.out.println("==================**Welcome to Lab ##3**==================");
		System.out.println("==========================================================");

		System.out.println("");
		do {
			System.out.print("Please, Type the length: ");
			double length = in.nextDouble();
			System.out.println("");
			System.out.print("Please, Type the Width: ");
			double width = in.nextDouble();

			Area returnArea = new Area(length, width);
			returnArea.print();

			count++;
			// System.out.println(count);
			System.out.println("Would you like to Keep going: Yes || No");
			keepGoing = in.next();
		} while (keepGoing.equalsIgnoreCase("Yes"));

		if (keepGoing.equalsIgnoreCase("No")) {
			System.out.println("Thank you for creating "+ count +" Areas with our program");

		}
	}

}
