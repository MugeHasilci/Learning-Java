package lesson1;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter some number");
		int user_input_number = scan.nextInt();
		
		System.out.println("The entered value is");
		System.out.print(user_input_number);

	}

}
