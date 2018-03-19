package JavaBasic;

import java.util.Scanner;

public class bai12 {
	//trung binh cong ba so
	public static void main(String[] args) {
		double a,b,c, tbc;
		System.out.println("nhap 3 so");
		Scanner key = new Scanner(System.in);
		a=key.nextDouble();
		b=key.nextDouble();
		c=key.nextDouble();
		tbc = (a+b+c)/3;
		System.out.println(tbc);

	}

}
