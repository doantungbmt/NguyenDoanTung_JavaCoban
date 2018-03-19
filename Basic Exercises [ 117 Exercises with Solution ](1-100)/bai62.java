package JavaBasic;

import java.util.Scanner;

public class bai62 {
	public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Nhap so thu nhat : ");
        int x = key.nextInt();  
		System.out.print("nhap sm thu hai: ");
		int y = key.nextInt(); 
		System.out.print("nhap so thu ba : ");
        int z = key.nextInt(); 
        System.out.println((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20));
    }
}
