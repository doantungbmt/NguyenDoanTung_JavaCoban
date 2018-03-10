package JavaBasic;

import java.util.Scanner;

public class bai52 {
	public static void main(String[]args) {
		Scanner key = new Scanner(System.in);
		System.out.println("nhap so thu nhat: ");
		int a = key.nextInt();
		System.out.println("nhap so thu hai: ");
		int b = key.nextInt();
		System.out.println("nhap so thu ba: ");
		int c = key.nextInt();
		if((a+b)==c) {
			System.out.println("So thu nhat la: "+a);
			System.out.println("So thu nhat la: "+b);
			System.out.println("So thu nhat la: "+c);
			System.out.println("Ket qua la: True");
		}
		else {
			System.out.println("So thu nhat la: "+a);
			System.out.println("So thu nhat la: "+b);
			System.out.println("So thu nhat la: "+c);
			System.out.println("Ket qua la: False");
		}
	}

}
