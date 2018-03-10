package JavaBasic;

import java.util.Scanner;

public class bai115 {
	public static void main(String[] args)
	 {
	        int num;
	        Scanner key = new Scanner(System.in);	
	        System.out.print("Nhap so nguyen duong: ");
	        int n = key.nextInt(); 
	        System.out.printf("Is %d is a palindrome number?\n",n);
			System.out.println(palindrome(n)); 
	    }
	    
	private static boolean palindrome(int num) {
	        String str = String.valueOf(num);
	        int i = 0;
	        int j = str.length() - 1;
	        while (i < j) {
	            if (str.charAt(i++) != str.charAt(j--)) {
	                return false;
	            }
	        }
	        return true;
	  }
}	
