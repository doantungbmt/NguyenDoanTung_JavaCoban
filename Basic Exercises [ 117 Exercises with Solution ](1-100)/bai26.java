package JavaBasic;

import java.util.Scanner;
	//bat phan sang nhi phan
public class bai26 {
	public static void main(String[] args) 
	 {
	  Scanner key = new Scanner(System.in);
	  int[] giatribatphan = {0, 1, 10, 11, 100, 101, 110, 111};
	  long sobatphan, a, sonhiphan, b;
	  int rem;
	  System.out.print("Input any octal number: ");
	  sobatphan = key.nextLong();
	  a = sobatphan;
	  sonhiphan = 0;
	  b = 1;
	  while (a != 0)
	  {
	   rem = (int)(a% 10);
	   sonhiphan = giatribatphan[rem] * b + sonhiphan;
	   a /= 10;
	   b *= 1000;
	  }
	  System.out.print("Equivalent binary number: " + sonhiphan+"\n");
	 }
}
