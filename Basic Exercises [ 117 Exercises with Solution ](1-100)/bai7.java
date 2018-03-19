package JavaBasic;

import java.util.Scanner;

public class bai7 {
	public static void main(String[]args) {
		int a;
		System.out.println("Input number");
		Scanner key = new Scanner(System.in);
		a = key .nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println(a+" x " + i + " = " + (a*i));
		}
	}
		
}
