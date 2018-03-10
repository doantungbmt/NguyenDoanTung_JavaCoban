package JavaBasic;

import java.util.Scanner;

public class bai5 {
	public static void main (String[]args) {
		int a,b;
		System.out.println("nhap vao 2 so");
		Scanner key = new Scanner (System.in);
		a = key.nextInt();
		b = key.nextInt();
		int c = a*b;
		System.out.println(a + "x" + b +"=" + c);
	}
}	
