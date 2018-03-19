package JavaBasic;

import java.util.Scanner;

public class bai18 {
	public static void main(String[] args)
	 {
	  int Sothunhat, Sothuhai, Tich = 0;
	  int a, b = 1;
	  Scanner key = new Scanner(System.in);
	  System.out.print("Nhap so nhi phan thu nhat: ");
	  Sothunhat = key.nextInt();
	  System.out.print("Nhap so nhi phan thu hai: ");
	  Sothuhai = key.nextInt();
	  while (Sothuhai != 0)
	  {
	   a = (int)(Sothuhai % 10);
	   if (a == 1) 
	   {
		   Sothunhat = Sothunhat * b;
	    Tich = Tich((int) Sothunhat, (int) Tich);
	   } 
	   else
	   {
		   Sothunhat = Sothunhat * b;
	   }
	   Sothuhai = Sothuhai / 10;
	   b = 10;
	  }
	  System.out.print("Tich hai so: " + Tich+"\n");
	 }
	 static int Tich(int Sothunhat, int Sothuhai) 
	 {
	  int i = 0, du = 0;
	  int[] sum = new int[20];
	  int ketqua = 0;

	  while (Sothunhat != 0 || Sothuhai != 0) 
	  {
	   sum[i++] = (Sothunhat % 10 + Sothuhai % 10 + du) % 2;
	   du = (Sothunhat % 10 + Sothuhai % 10 + du) / 2;
	   Sothunhat = Sothunhat / 10;
	   Sothuhai = Sothuhai / 10;
	  }
	  if (du != 0)
	  {
	   sum[i++] = du;
	  }
	  --i;
	  while (i >= 0) 
	  {
		  ketqua =ketqua * 10 + sum[i--];
	  }
	  return ketqua;
	 }
}


