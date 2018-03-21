package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

//Write a Java program to read the value of an integer m and display the value of n is 1 when m is larger than 0,
	//0 when m is 0 and -1 when m is less than 0.
public class bai4 {
	public static void main (String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("m = ");
		int m = key.nextInt();
		System.out.print("gia tri m = " + m +"\n");
		if(m>0) System.out.print("gia tri n = 1");
		if(m==0) System.out.print("gia tri n = 0");
		if(m<0) System.out.print("gia tri n = -1");
	}
}
