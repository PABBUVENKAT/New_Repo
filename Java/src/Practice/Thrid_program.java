package Practice;

import java.util.Scanner;

public class Thrid_program {
	public static void main(String[] args) {
		try (Scanner input = new Scanner (System.in)) {
			System.out.print("Enter first Number :");
			int num1 = input.nextInt();
			System.out.print("Enter second Number :");
			int num2 = input.nextInt();
			int Sum = num1+num2;
			System.out.println("Sum of two number  :"+ Sum);
		}	
	}
}
