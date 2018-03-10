package JavaBasic;

import java.util.Scanner;

public class bai108 {
	  public static void main(String[] arg) {	
	        Scanner key = new Scanner(System.in);	
	       System.out.print("Nhap so duong: ");
	        int n = key.nextInt(); 
			if (n>0)
			{
	           System.out.println("So le la: "+(n == 0 ? 0 : (n % 9 == 0 ? 9 : n % 9)));
			}
			System.out.println("\n");  
	    }
}
