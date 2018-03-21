package Java_Data_Types_Exercises_10_exercises_with_solution;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		System.out.print("inch sang m: \nnhap inch: ");
		Scanner key = new Scanner(System.in);
		double inch = key.nextDouble();
		double m = inch/39.370;
		System.out.println(inch + "inch" + " = " + m + "m");

	}

}
