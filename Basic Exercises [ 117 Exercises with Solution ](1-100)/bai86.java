package JavaBasic;

import java.util.Scanner;

public class bai86 {
	public static void main (String[]args) {
		Scanner key = new Scanner(System.in);
		System.out.println("Nhap n");
		int n = key.nextInt();
		int dapso = 0;
		while(n!=1) {
			System.out.println(n);
			if (n%2==0) {
				n = n/2;
				dapso +=1;
			}
			else {
				n = (3 * n + 1) / 2;
				dapso += 1;
			}
		}
		System.out.println(dapso);
	}
	
}
