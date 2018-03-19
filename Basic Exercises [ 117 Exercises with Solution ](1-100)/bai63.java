package JavaBasic;

import java.util.Scanner;

public class bai63 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Nhap so thu nhat:");
		int a = key.nextInt();
		System.out.println("Nhap so thu hai:");
		int b = key.nextInt();
		if(a>b) {
			if(a%6==b%6) {
				System.out.println(b);				
			}
			else System.out.println(a);
		}
		if(a<b) {
			if(a%6==b%6) {
				System.out.println(a);
			}
			else System.out.println(b);
		}
		if(a==b) {
			System.out.println("result: 0");
		}
	}

}
