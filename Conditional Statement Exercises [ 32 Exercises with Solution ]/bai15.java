package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

// Write a program in Java to display the n terms of odd natural number and their sum.
public class bai15 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Nhap so: ");
		int sum=0;
		int a = key.nextInt();
		for(int i=1;i<=a;i++) {
			System.out.println(2*i-1);
			sum=sum+(2*i-1);
			
		}
		System.out.println("tong " + a + " so tu nhien le dau tien la: " + sum);
	}
}
