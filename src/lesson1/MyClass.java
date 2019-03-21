package lesson1;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan = new Scanner (System.in);
		System.out.println("Enter some number");
		int user_input_number = scan.nextInt();
		
		System.out.println("The entered value is");
		System.out.print(user_input_number);
		
		Scanner scan1 = new Scanner (System.in);
		System.out.println("Enter some decimal number");
		double user_input_number_double = scan.nextDouble();
		
		System.out.println("The entered value is");
		System.out.print(user_input_number_double);
		
		Scanner scan2 = new Scanner (System.in);
		System.out.println("Enter some text");
		String user_input_string = scan.nextLine();
		
		System.out.println("The entered value is");
		System.out.print(user_input_string);
		
		
		int x = 11;
		x += 5;
		System.out.println(++x);
		System.out.println(x);
		
		
		int x = 10;
		
		if (x != 20) {
			System.out.println("Yes x == 10");
		}	
		else {
			System.out.println("no x != 10");
		}
		
		int subject1 = 35;
		int subject2 = 45;
		
		if(subject1 >= 30 && subject2 >= 45) {
			System.out.print("The condition is true");
		} else {
			System.out.print("The condition is wrong");
		}
		
		if(subject1 >= 60 || subject2 <= 45) {
			System.out.print("The condition is true");
		} else {
			System.out.print("The condition is wrong");
		}*/
		
		int score = 90;
		switch(score)
		{
		case 90 :
			System.out.print("Very good");
			break;
			
		case 60 :
			System.out.print("Good");
			break;
			
		case 40 :
			System.out.print("OK");
			break;
		
		default :
			System.out.print("Grades are not defined");
		}
	} 
	

}
