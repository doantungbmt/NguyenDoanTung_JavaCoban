package JavaBasic;

import java.util.Scanner;

public class bai11 {
	//tinh hu vi va dien tichhinh tron
	public static void main(String[] args) {
		double a, chuvi, dientich, pi=3.14;
		System.out.println("nhap ban kinh hinh tron");
		Scanner key = new Scanner(System.in);
		a = key.nextDouble();
		chuvi = 2*a*pi;
		dientich = a*a*pi;
		System.out.println("Chu vi la: " + chuvi);
		System.out.println("dien tich la: "+ dientich);
	}

}
