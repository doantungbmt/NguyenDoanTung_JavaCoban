package JavaBasic;

import java.util.Scanner;

//Nhi phan sang thap phan
public class bai22 {
	public static void main(String[] args) 
	 {
	  Scanner key = new Scanner(System.in);
	  long sonhiphan, sothapphan= 0, j = 1, du;
	  System.out.print("Nhap so nhhi phan: ");
	  sonhiphan = key.nextLong();

	  while (sonhiphan != 0) 
	  {
		  du = sonhiphan % 10;
	   sothapphan = sothapphan + du * j;
	   j = j * 2;
	   sonhiphan =sonhiphan / 10;
	  }
	  System.out.println("So thap phan la: " + sothapphan);
	 }

}
