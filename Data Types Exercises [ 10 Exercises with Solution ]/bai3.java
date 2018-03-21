package Java_Data_Types_Exercises_10_exercises_with_solution;

import java.util.Scanner;

public class bai3 {
	public static void main(String[] args) {
		System.out.print("Nhap so tu 0-1000: ");
		Scanner key = new Scanner(System.in);
		int a = key.nextInt();
		if (0<a&&a<1000){
		int sothunhat = a/100;
		int sothuhai = (a%100)/10;
		int sothuba = (a%100)%10;
		int tong = sothunhat+ sothuhai+sothuba;
		System.out.print("Tong cac chu so la: "+tong);	
		}
		else System.out.print("Khong thoa man... Nhap lai");
	}
		
}
