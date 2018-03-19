package JavaBasic;

import java.util.Scanner;

public class bai117 {
	public static void main(String[]args) {
	Scanner key = new Scanner(System.in);
	System.out.println("Nhap so");
	int a= key.nextInt();
	double canbac = Math.sqrt(a);
	System.out.println("can bac hai cua " + a + " la: " +canbac);
	}
}
