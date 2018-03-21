package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

//Write a program in Java to display n terms of natural numbers and their sum.
public class bai11 {
	 public static void main (String[] args) {
		Scanner key  = new Scanner(System.in);
		System.out.print("nhap so: ");
		int a = key.nextInt();
		int sum = 0;
		for(int i =1; i<=a; i++) {
			sum = sum+i;
		}
		System.out.print("Tong " +a+ " so tu nhien dau tien la: " +sum);
	}
}
