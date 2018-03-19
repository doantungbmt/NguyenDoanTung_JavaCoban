package JavaBasic;

import java.util.Scanner;

public class bai37 {
	  public static void main(String[] args) {
	        Scanner key = new Scanner(System.in);
	        System.out.print("Nhap chuoi: ");
	        char[] chuoi = key.nextLine().toCharArray();
	        System.out.print("Chuoi nguoc lai: ");
	        for (int i = chuoi.length - 1; i >= 0; i--) {
	            System.out.print(chuoi[i]);
	        }
	        System.out.print("\n");
	    }
}	
