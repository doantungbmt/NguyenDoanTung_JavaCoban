package JavaBasic;

import java.util.Scanner;

public class bai109 {
	  public static void main(String[] arg) {
		  Scanner key = new Scanner(System.in);	
	       System.out.print("Nhap so duong: ");
	        int n = key.nextInt(); 
			if (n>0)
			{
	           System.out.println("So dong: "+((int)((Math.sqrt(8 * (long)n + 1) - 1) / 2)));	
			}       	
		}	
}
