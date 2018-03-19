package JavaBasic;

import java.util.Scanner;

public class bai34 {
	//tinh dien tich hinh luc giac
	//S=(6 * s ^ 2) / (4 * tan (π / 6)) 
	public static void main(String[] args) {
		System.out.println("nhap canh hinh luc giac");
		Scanner key = new Scanner(System.in);
		int a = key.nextInt();
		double dtich, pi = 3.14;
		dtich = (6*Math.pow(a, 2))/(4*Math.tan(pi/6));
		System.out.println("dien tich hinh luc giac la : "+dtich);
		
	}
}
