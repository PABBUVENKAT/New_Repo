package Practice;

import java.util.Scanner;

public class Second_program {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter your first name : ");
			String firstname = input.next();
			System.out.println("Enter your last name : ");
			String lastname = input.next();
			System.out.println("Hello \n" + firstname + "  " + lastname);
		}

	}

}
