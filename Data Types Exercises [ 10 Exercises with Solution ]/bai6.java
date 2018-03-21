package Java_Data_Types_Exercises_10_exercises_with_solution;

import java.util.Scanner;

public class bai6 {
	public static void main(String[] args) {
		System.out.println("chi so BMI: ");
		System.out.println("Nhap chieu cao(cm)");
		Scanner key = new Scanner(System.in);
		double chieucao = key.nextDouble();
		System.out.println("Nhap can nang(Kg)");
		int cannang = key.nextInt();
		double BMI = cannang/Math.pow(chieucao, 2);
		System.out.println("Chi so BMI la: " + BMI);
		
		
	}
}
