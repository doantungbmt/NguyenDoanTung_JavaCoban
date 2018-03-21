package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

public class bai3 {
	public static void main (String[] args) {
		Scanner key = new Scanner (System.in);
		System.out.print("Nhap so thu nhat ");
		int a = key.nextInt();
		System.out.print("Nhap so thu hai ");
		int b = key.nextInt();
		System.out.print("Nhap so thu ba ");
		int c = key.nextInt();
		if(a>b)
			if(a>c)
				System.out.print("So lon nhat la: "+a);
		if(b>a)
			if(b>c)
				System.out.print("So lon nha la: " + b);
		if(c>a)
			if(c>b)
				System.out.print("So lon nhat la: "+c);
	}
}
