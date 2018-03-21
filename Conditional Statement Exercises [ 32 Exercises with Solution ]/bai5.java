package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

//Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday. 
public class bai5 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Nhap so: ");
		int a = key.nextInt();
		if(a<1||a>7) System.out.print("Nhap sai... Nhap lai");
		switch(a) {
		case 1: System.out.print("Monday");
			break;
		case 2: System.out.print("Tuesday");
		break;
		case 3: System.out.print("Wednesday");
		break;
		case 4: System.out.print("Thusday");
		break;
		case 5: System.out.print("Friday");
		break;
		case 6: System.out.print("Saturday");
		break;
		case 7: System.out.print("Sunday");
		break;
		}

	}

}
