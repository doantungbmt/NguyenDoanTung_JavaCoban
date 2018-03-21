package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

public class bai31 {
	public static void main(String [] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Nhap so thu nhat: ");
		int a = key.nextInt();
		System.out.print("Nhap so thu hai: ");
		int b = key.nextInt();
		System.out.print("Nhap so thu ba: ");
		int c = key.nextInt();
		if(a>b&&b>c) System.out.print("Ba so giam");
		else { 
			if(a<b&&b<c) System.out.print("Ba so tang");
		
			else System.out.print("Neither increasing or decreasing order");
	
		}
	}
		
}
