package Java_Data_Types_Exercises_10_exercises_with_solution;

import java.util.Scanner;

public class bai1 {
	public static void main (String[] arsg) {
		System.out.println("Chuyen tu do Fahrenheit sang Celsius \n Nhap do Fahreheit");
		Scanner key = new Scanner(System.in);
		int F = key.nextInt();
		double C = (F-32)/1.8;
		System.out.println(F + " Do F = " + C + " Do C");
	}
}
