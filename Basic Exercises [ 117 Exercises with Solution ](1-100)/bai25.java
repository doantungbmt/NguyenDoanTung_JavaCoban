package JavaBasic;

import java.util.Scanner;

//bat phan sang thap phan
public class bai25 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("nhap so thap phan: ");
		String octalString=key.nextLine();
		int decimal=Integer.parseInt(octalString,8);
		System.out.println("So he bat phan: " + decimal);
	}


}
