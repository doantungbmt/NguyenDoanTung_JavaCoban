package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

//Write a Java program to find the number of days in a month.
public class bai7 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.print("Nhap thang: ");
		int a = key.nextInt();
		System.out.print("Nhap nam: ");
		int nam = key.nextInt();
		String Thang ="";
		int so_ngay = 0;
		switch(a) {
		case 1: Thang = "Thang 1";
		so_ngay = 31;
		break;
		case 2: Thang ="Thang 2";
		if((nam%4)==0) {
			so_ngay = 29;
		}
		else so_ngay = 28;
		break;
		case 3: Thang = "Thang 3";
		so_ngay = 31;
		break;
		case 4: Thang = "Thang 4";
		so_ngay = 30;
		break;
		case 5: Thang = "Thang 5";
		so_ngay = 31;
		break;
		case 6: Thang = "Thang 6";
		so_ngay = 30;
		break;
		case 7: Thang = "Thang 7";
		so_ngay = 31;
		break;
		case 8: Thang = "Thang 8";
		so_ngay = 31;
		break;
		case 9: Thang = "Thang 9";
		so_ngay = 30;
		break;
		case 10: Thang = "Thang 10";
		so_ngay = 31;
		break;
		case 11: Thang = "Thang 11";
		so_ngay = 30;
		break;
		case 12: Thang = "Thang 12";
		so_ngay = 31;
		break;
		}
		System.out.print(Thang+" Nam "+nam+" co "+ so_ngay+ " ngay");
	}

}
