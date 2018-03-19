package JavaBasic;

import java.util.Scanner;

public class bai110 {
	public static void main(String[] arg) 
	 {
	   int test = 0;
	   Scanner key = new Scanner(System.in);	
	   System.out.println("nhap so nguyen duong: ");
	   int n = key.nextInt(); 
      if (n < 1) {
			 System.out.println(Boolean.toString(false));
			 test = 1;
		}
		if ((n & (n - 1)) != 0) {
			System.out.println(Boolean.toString(false));
			test = 1;
		}
		if (test==0)
		{
			System.out.println(Boolean.toString((n & 0x55555555) != 0));      	
		}
	}	
}
