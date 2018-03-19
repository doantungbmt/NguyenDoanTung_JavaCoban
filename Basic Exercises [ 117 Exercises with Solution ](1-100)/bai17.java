package JavaBasic;

import java.util.Scanner;

public class bai17 {
	public static void main(String[] args)
	 {
	  int Sothunhat, Sothuhai;
	  int i = 0, du = 0;
	  int[] sum = new int[20];
	  Scanner key = new Scanner(System.in);

	  System.out.print("Nhap so thu nhat: ");
	  Sothunhat = key.nextInt();
	  System.out.print("Nhap so thu hai: ");
	  Sothuhai = key.nextInt();

	  while (Sothunhat != 0 || Sothuhai != 0) 
	  {
	   sum[i++] = (int)((Sothunhat % 10 + Sothuhai % 10 + du) % 2);
	   du = (int)((Sothunhat % 10 + Sothuhai % 10 + du) / 2);
	   Sothunhat = Sothunhat / 10;
	   Sothuhai= Sothuhai / 10;
	  }
	  if (du != 0) {
	   sum[i++] = du;
	  }
	  --i;
	  System.out.print("Tong hai so nhi phan: ");
	  while (i >= 0) {
	   System.out.print(sum[i--]);
	  }
	   System.out.print("\n");  
	 }

}
