package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

public class bai6 {
	 public static void main(String[] args)
	    {
	        Scanner in = new Scanner(System.in);

	        System.out.print("Nhap so thu nhat: ");
	        double x = in.nextDouble();
	        System.out.print("Nhap so thu hai: ");
	        double y = in.nextDouble();

	        x = Math.round(x * 1000);
	        x = x / 1000;

	        y = Math.round(y * 1000);
	        y = y / 1000;

	        if (x == y)
	        {
	            System.out.println("Hai so giong nhau");
	        }
	        else
	        {
	            System.out.println("Hai so khac nhau");
	        }
	    }
}
