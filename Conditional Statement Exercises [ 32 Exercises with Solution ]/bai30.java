package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

//Write a Java program that accepts three numbers and prints "All numbers are equal" if all three 
	//numbers are equal, "All numbers are different" if all three numbers are different and "Neither all are 
 	//equal or different" otherwise.
public class bai30 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Nhap so thu nhat: ");
		int a = key.nextInt();
		System.out.print("Nhap so thu hai: ");
		int b = key.nextInt();
		System.out.print("Nhap so thu ba: ");
		int c = key.nextInt();
		if(a==b&&b==c) System.out.print("Tat ca so bang nhau.");
		if(a==b&&a!=c||a==c&&a!=b||c==b&&a!=c) System.out.print("Hai trong ba so giong nhau.");
		if(a!=b&&b!=c) System.out.print("Ba so khac nhau.");

	}

}
