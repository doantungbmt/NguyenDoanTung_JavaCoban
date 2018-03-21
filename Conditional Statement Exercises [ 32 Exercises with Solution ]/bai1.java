package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

//Write a Java program to get a number from the user and print whether it is positive or negative. 
public class bai1 {
	public static void main (String[] args) {
		System.out.println("Nhap so: ");
		Scanner key = new Scanner(System.in);
		int a = key.nextInt();
		if(a>0) {
			System.out.println("Day la so duong");
		}
		else System.out.println("Day la so am");
	}
}
