package JavaBasic;

import java.util.Scanner;

public class bai60 {
	 public static void main(String[] args){	
	     Scanner key = new Scanner(System.in);
	     System.out.print("Nhap cau: ");
		 String cau = key.nextLine();
		 String[] words = cau.split("[ ]+");
		 System.out.println("Chu canh chu cuoi cung: "+words[words.length - 2]);
		 }
}
