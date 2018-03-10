package JavaBasic;

import java.util.Scanner;

public class bai54 {
	public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.print("nhap so thu nhat : ");
        int x = key.nextInt();  
		System.out.print("nhap so thu hai: ");
		int y = key.nextInt(); 
		System.out.print("nhap so thu ba : ");
        int z = key.nextInt(); 
        System.out.print("ket qua la: "+kiemtra(x, y, z,true));
		System.out.print("\n");
    }
   
    public static boolean kiemtra(int p, int q, int r, boolean xyz)
     {
	     return (p % 10 == q % 10) || (p % 10 == r % 10) || (q % 10 == r % 10);
     }
}
