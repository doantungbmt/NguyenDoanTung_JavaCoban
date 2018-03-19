package JavaBasic;

import java.util.Scanner;

public class bai32 {

	public static void main(String[] args) {
		int a,b;
		System.out.println("Input data:");
		Scanner key = new Scanner(System.in);
		a = key.nextInt();
		b = key.nextInt();
		if(a!=b)
			System.out.println(a + " != " + b);
		if(a<b)
			System.out.println(a + " < " + b);
		if(a<=b)
			System.out.println(a + " <= " + b);
		if(a>b)
			System.out.println(a + " > " + b);
		if(a>=b)
			System.out.println(a + " >= " + b);
		

	}

}
