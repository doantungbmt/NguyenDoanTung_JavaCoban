package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

// Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
public class bai29 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Nhap so: ");
		double a = key.nextInt();
		if(a<1) System.out.print("So am, ko nhan");
		if(1<=a&&a<10) {
			System.out.print("So chu so la: 1");
		}if(10<=a&&a<100) {
			System.out.print("So chu so la: 2");
		}
		if(100<=a&&a<1000) {
			System.out.print("So chu so la: 3");
		}
		if(1000<=a&&a<10000) {
			System.out.print("So chu so la: 4");
		}
		if(10000<=a&&a<100000) {
			System.out.print("So chu so la: 5");
		}
		if(100000<=a&&a<1000000) {
			System.out.print("So chu so la: 6");
		}
		if(1000000<=a&&a<10000000) {
			System.out.print("So chu so la: 7");
		}
		if(10000000<=a&&a<100000000) {
			System.out.print("So chu so la: 8");
		}
		if(100000000<=a&&a<1000000000) {
			System.out.print("So chu so la: 9");
		}
		if(1000000000<=a) {
			System.out.print("So chu so la: 10");
		}
		
		
	}

}
