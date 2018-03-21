package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

//Write a program in Java to input 5 numbers from keyboard and find their sum and average
public class bai12 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Nhap vao 5 so");
		int a = key.nextInt();
		int b = key.nextInt();
		int c = key.nextInt();
		int d = key.nextInt();
		int e = key.nextInt();
		int sum = a+b+c+d+e;
		double aver = (a+b+c+d+e)/5;
		System.out.println("Tong 5 so la: "+sum+"\n" +"Trung binh cong 5 so la: "+aver);
		
	}

}
