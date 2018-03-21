package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

// Write a program in Java to display the cube of the number upto given an integer.
public class bai13 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("nhap so: ");
		int n = key.nextInt();
		double cube;
		for(int i=1;i<=n;i++) {
			cube = Math.pow(i, 3);
		System.out.println("Number is: " +i+" and cube of "+i+" is: "+cube);
		}
	}

}
