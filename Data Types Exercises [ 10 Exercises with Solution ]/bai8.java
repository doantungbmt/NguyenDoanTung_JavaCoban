package Java_Data_Types_Exercises_10_exercises_with_solution;
	//Write a Java program that reads a number and display the square, cube, and fourth power
import java.util.Scanner;

public class bai8 {
	public static void main(String[] args)
    {
		Scanner key = new Scanner(System.in);
		System.out.print("Nhap so: ");
		int a = key.nextInt();
		System.out.println("square: " + Math.pow(a, 2)+"\n"+"cube: " +Math.pow(a, 3) +"\n"+"fourth power: "+Math.pow(a, 4));
    }
}
