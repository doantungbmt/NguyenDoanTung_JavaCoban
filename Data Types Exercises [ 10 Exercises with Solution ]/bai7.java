package Java_Data_Types_Exercises_10_exercises_with_solution;

import java.util.Scanner;

public class bai7 {
	public static void main(String[] args) {
		System.out.print("Nhap quang duong(m): ");
		Scanner key = new Scanner(System.in);
		double S=key.nextDouble();
		System.out.print("Nhap so gio: ");
		double hour = key.nextDouble();
		System.out.print("Nhap so phut: ");
		double min = key.nextDouble();
		System.out.print("Nhap so giay: ");
		double sec = key.nextDouble();
		double tonggiay, tonggio;
		tonggiay = sec + min*60 + hour*60*60;
		double meter_per_second = S/tonggiay;
		System.out.println("toc do m/s: "+meter_per_second+"m/s");
		
		tonggio = hour + min/60 + (sec/60)/60;
		double km = S/1000;
		double kilometers_per_hour = km/tonggio;
		System.out.println("toc do km/h: "+kilometers_per_hour+"km/h");
		
		double mile = S/1609;
		double mile_per_hour = mile/tonggio;
		System.out.println("toc do miles/h: "+mile_per_hour+"miles/h");
	}
}
