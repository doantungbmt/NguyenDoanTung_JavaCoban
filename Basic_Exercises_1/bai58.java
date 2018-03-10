package JavaBasic;

import java.util.Scanner;

public class bai58 {
	public static void main(String[] args){
		 Scanner key = new Scanner(System.in);
	     System.out.print("Nhap cau: ");
		 String cau = key.nextLine();
		 String caudoi = ""; 
	       Scanner causua = new Scanner(cau); 
	         while(causua.hasNext()) {
	             String word = causua.next(); 
	             caudoi += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " "; 
	         }
	      System.out.println(caudoi.trim()); 
	    }
}
