package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

// Write a Java program to solve quadratic equations (use if, else if and else).
public class bai2 {
	public static void main (String[] args) {
		double a, b, c, delta, x1, x2;
		Scanner key = new Scanner(System.in);
		System.out.print("a = ");
		a = key.nextDouble();
		System.out.print("b = ");
		b = key.nextDouble();
		System.out.print("c = ");
		c = key.nextDouble();
		if (a==0) {
			if(b==0) {
				if(c==0) {
					System.out.println("phuong trinh co vo so nghiem");
				}
				else System.out.println("phuong trinh vo nghiem");
			}
			else System.out.println("phuong tirnh co mot nghiem : x= " + ((-c)/b));
		}
		else {
			delta = b*b - 4*a*c;
			if(delta<0) {
				System.out.println("phuong trinh vo nghiem");
			}
			else {
				x1 = ((-b) + Math.sqrt(delta))/(2*a);
				x2 = ((-b) - Math.sqrt(delta))/(2*a);
				System.out.println("phuong trinh co 2 nghiem: \nx1= " + x1 + "\nx2 = " + x2);
			}
		}
		
	}

}
