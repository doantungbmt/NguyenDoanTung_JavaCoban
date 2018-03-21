package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

//Write a program in Java to display the multiplication table of a given integer.
public class bai14 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Nhap so: ");
		int n = key.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(n +" x " + i +" = " + n*i);
		}
	}

}
