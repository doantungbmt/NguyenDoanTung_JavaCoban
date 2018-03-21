package Java_Data_Types_Exercises_10_exercises_with_solution;

import java.util.Scanner;

//Write a Java program that accepts two integers from the user and then prints the sum, the 
	//difference, the product, the average, the distance (the difference between integer), the maximum 
	//(the larger of the two integers), the minimum (smaller of the two integers)
public class bai9 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("So thu nhat: ");
		int a = key.nextInt();
		System.out.print("So thu hai: ");
		int b = key.nextInt();
		int sum = a+b;
		int diff = a-b;
		int pro = a*b;
		double aver = (a+b)/2;
		int distance = Math.abs(a-b);
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		System.out.println("Tong hai so: " + sum);
		System.out.println("Tich hai so: " + diff);
		System.out.println("Trung binh cong hai so: " + aver);
		System.out.println("Khoang cach hai so: " + distance);
		System.out.println("So lon nhat trong hai so: " + max);
		System.out.println("SO nho nhat trong hai so: " + min);
	}

}
