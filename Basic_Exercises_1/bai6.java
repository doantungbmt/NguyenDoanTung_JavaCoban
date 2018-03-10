package JavaBasic;

import java.util.Scanner;

public class bai6 {
	public static void main (String[]args) {
		int a,b;
		System.out.println("nhap vao 2 so");
		Scanner key = new Scanner (System.in);
		a = key.nextInt();
		b = key.nextInt();
		int c1 = a+b, c2 = a-b, c3 =a*b, c4=a/b; 
		System.out.println(a+" + "+ b + " = " + c1);
		System.out.println(a+" - "+ b + " = " + c2);
		System.out.println(a+" * "+ b + " = " + c3);
		System.out.println(a+" / "+ b + " = " + c4);
		System.out.println(a+" mod "+ b + " = " + c4);
	}

}
