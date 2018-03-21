package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

public class bai9 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Nhap nam: ");
		int nam = key.nextInt();
		if((nam%4)==0)
			System.out.print("Nam "+nam+" la nam nhuan.");
		else System.out.print("Nam "+nam+" ko phai la nam nhuan.");
	}

}
