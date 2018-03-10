package JavaBasic;

import java.util.Scanner;

public class bai65 {
	public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Nhap so thu nhat : ");
        int a = key.nextInt();  
		System.out.print("Nhap so thu hai ");
		int b = key.nextInt(); 
		int chia = a / b;
		int ketqua = a - (chia * b);
		System.out.println(ketqua); 
	}
}
