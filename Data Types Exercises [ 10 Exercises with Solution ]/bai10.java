package Java_Data_Types_Exercises_10_exercises_with_solution;

import java.util.Scanner;

public class bai10 {
	public static void main(String[] args) {
		System.out.println("Nhap vao 6 so ko am: ");
		Scanner key = new Scanner(System.in);
		int a = key.nextInt();
		int so1 = a/100000;
		int so2 = (a%100000)/10000;
		int so3 = ((a%100000)%10000)/1000;
		int so4 = (((a%100000)%10000)%1000)/100;
		int so5 = ((((a%100000)%10000)%1000)%100)/10;
		int so6 = (((((a%100000)%10000)%1000)%100)%10);
		System.out.println(so1 +" "+so2+" "+so3+" "+so4+" "+so5+" "+so6);
	}
}
