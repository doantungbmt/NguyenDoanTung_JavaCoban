package JavaBasic;

import java.util.Scanner;

public class bai36 {
	//tinh khoang cach giua 2 diem tren trai dat  [(x1, y1) & (x2, y2)] 
	//d = ban kinh * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)) 
	//Ban kinh r = 6371,01 Kilometers 
	public static void main(String[] args) {
		double x1,y1,x2,y2;
		Scanner key = new Scanner(System.in);
		System.out.println("nhap vi do cua diem thu nhat: ");
		x1 = key.nextDouble();
		x1 = Math.toRadians(x1);
		System.out.println("nhap kinh do cua diem thu nhat: ");
		y1 = key.nextDouble();
		y1 = Math.toRadians(y1);
		System.out.println("nhap vi do cua diem thu hai: ");
		x2 = key.nextDouble();
		x2 = Math.toRadians(x2);
		System.out.println("nhap kinh do cua diem thu hai: ");
		y2 = key.nextDouble();
		y2 = Math.toRadians(y2);
		double bktraidat = 6371.01, kcach;
		kcach = bktraidat*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
		System.out.println("khoang cach giua 2 diem la: " + kcach +" km");
		
	}

}
