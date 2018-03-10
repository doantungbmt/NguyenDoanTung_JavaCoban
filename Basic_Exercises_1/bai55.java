package JavaBasic;

import java.util.Scanner;

//nhap giay ra gio phu giay
public class bai55 {
	public static void main(String[]args) {
		Scanner key = new Scanner(System.in);
		System.out.println("nhap so giay");
		int sec = key.nextInt();
		int h, m, s;
		h = sec/(60*60);
		m = (sec%(60*60))/60;
		s = (sec%(60*60))%60;
		System.out.println(h + ":" + m + ":" + s);
	}

}
