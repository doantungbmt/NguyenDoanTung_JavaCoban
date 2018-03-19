package JavaBasic;

import java.util.Scanner;

//nhi phan sang thap luc phan
public class bai23 {
	public static void main(String[] args) 
	 {
	  int[] mang = new int[1000];
	  int i = 1, j = 0, a, b = 0, c;
	  Scanner key = new Scanner(System.in);
	  System.out.print("So nhi phan: ");
	  c = key.nextInt();
	  while (c > 0) {
	   a = c % 2;
	   b = b + a * i;
	   i = i * 2;
	   c = c/ 10;
	  }
	   i = 0;
	  while (b != 0) {
	   mang[i] = b % 16;
	   b = b / 16;
	   i++;
	  }
	  System.out.print("So thap luc phan: ");
	  for (j = i - 1; j >= 0; j--)
	  {
	   if (mang[j] > 9) 
	   {
	    System.out.println((char)(mang[j] + 55)+"\n");
	   } else
	   {
	    System.out.println(mang[j]+"\n");
	   }
	  }
	 }
}
