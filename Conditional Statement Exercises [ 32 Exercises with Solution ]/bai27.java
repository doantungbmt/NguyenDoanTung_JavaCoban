package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

//Write a Java program that reads an integer and check whether it is negative, zero, or positive. 
public class bai27 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Nhap so: ");
		int a= key.nextInt();
		if(a>0) System.out.print("Number is positive");
		if(a==0) System.out.print("Number is zero");
		if(a<0) System.out.print("Number is negative");
	}


}
