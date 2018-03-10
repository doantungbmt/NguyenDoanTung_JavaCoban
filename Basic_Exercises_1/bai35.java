package JavaBasic;

import java.util.Scanner;

public class bai35 {
	//tinh dien tich da giac
		//s = (n * s ^ 2) / (4 * tan (π / n))
		//n la so canh, s la chieu dai mot canh
	public static void main(String[] args) {
		System.out.println("nhap vao so canh va chieu dai canh");
		Scanner key = new Scanner(System.in);
		System.out.println("so canh: ");
		int socanh = key.nextInt();
		System.out.println("chieu dai canh: ");
		int dodaicanh = key.nextInt();
		double dtich, pi = 3.14;
		dtich = (socanh*Math.pow(dodaicanh, 2))/(4*Math.tan(pi/socanh));
		System.out.println("dien tich da giac la: "+dtich);
	}
}
