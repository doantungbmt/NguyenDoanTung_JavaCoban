package Java_Data_Types_Exercises_10_exercises_with_solution;

import java.util.Scanner;

public class bai4 {
	public static void main(String[] args) {
		System.out.print("Nhap so phut: ");
		Scanner key = new Scanner(System.in);
		int min = key.nextInt();
		int nam = min/525600;
		int day = (min%525600)/1440;
		System.out.println(min + " phut = " + nam + " nam " + day + " ngay");
	}
}
