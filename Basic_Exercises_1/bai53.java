package JavaBasic;

import java.util.Scanner;

public class bai53 {
	public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.print("Nhap so thu nhat : ");
        int x = key.nextInt();  
		System.out.print("Nhap so thu hai: ");
		int y = key.nextInt(); 
		System.out.print("Nhap so thu ba : ");
        int z = key.nextInt(); 
        System.out.print("ket qua la: "+abc(x, y, z,true));
		System.out.print("\n");
    }
    
    public static boolean abc(int p, int q, int r, boolean xyz)
     {
	   if(xyz)
		  return (r > q);
	   return (q > p && r > q);
     }
}
