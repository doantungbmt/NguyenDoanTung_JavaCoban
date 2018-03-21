package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

public class bai16 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("nhap so dong: ");
		int n = key.nextInt();
		for(int i=1; i<=n;i++) {
			for(int j=1;j<=i;j++) 
				System.out.print(j);
			System.out.println();
		}
		

	}

}
