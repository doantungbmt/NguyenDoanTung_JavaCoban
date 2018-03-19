package JavaBasic;

import java.util.Scanner;

public class bai33 {
	public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Nhap so: ");
        int a = key.nextInt();
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        System.out.println("tong chu so la: "+sum);
	}
}
	
