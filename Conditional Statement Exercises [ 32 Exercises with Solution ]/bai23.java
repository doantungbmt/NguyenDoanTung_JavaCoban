package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

public class bai23 {
	 public static void main(String args[]) 
	    {
	        Scanner key = new Scanner(System.in);
	        System.out.print("Nhap so: ");
	        int n = key.nextInt();
	        for (int i = n; i > 0; i--) {
	        	for (int spc = n - i; spc > 0; spc--) {
	        		System.out.print(" ");
	            }
	            for (int j = 0; j < i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
}
