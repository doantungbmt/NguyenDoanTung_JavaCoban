package JavaBasic;

import java.util.Scanner;

public class bai51 {
	public static void main(String[]args) {
		System.out.println("nhap so(String): ");
		Scanner key = new Scanner(System.in);
		String so = key.nextLine();
		int a = Integer.parseInt(so);
		System.out.println("so(int)\n" + a);
	}
}
