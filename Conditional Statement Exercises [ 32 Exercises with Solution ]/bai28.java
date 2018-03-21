package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

//Write a Java program that reads a floating-point number. If the number is zero it prints "zero", 
	//otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 
	//1, or "large" if it exceeds 1,000,000. 
public class bai28 {
	public static void main(String[]args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Nhap so: ");
		double n =key.nextDouble();
		if(n>0) {
			if(n<1) {
				System.out.print("Small");
			}
			else if(n>1000000) {
				System.out.print("Large");
			}
			else System.out.print("Positive");
		}
		if(n<0) System.out.print("Negative");
		
	}
}
