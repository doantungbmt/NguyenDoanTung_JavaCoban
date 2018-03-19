package JavaBasic;

import java.util.Scanner;

public class bai64 {
	public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Nhap so thu nhat : ");
        int a = key.nextInt();  
		System.out.print("Nhap so thu hai: ");
		int b = key.nextInt(); 
		System.out.println("Ket qua: "+So(a, b));
    }
	
	public static boolean So(int p, int q)
     {  
	   if (p<25 || q>75)
		   return false;
	   int x = p % 10;
	   int y = q % 10;
	   p /= 10;
	   q /= 10;
	   return (p == q || p == y || x == q || x == y);
     }
}
