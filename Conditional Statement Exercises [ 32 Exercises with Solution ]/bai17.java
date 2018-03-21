package Java_Conditional_Statement_Exercises_32_exercises_with_solution;
	//Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.The pattern is as follows 

import java.util.Scanner;

public class bai17 {
	public static void main (String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("nhap so dong: ");
		int n = key.nextInt();
		for (int i=1;i<=n;i++) {
			for(int j=1; j<=i; j++)
			System.out.print(i);
			System.out.println("");
		}
	}
}
