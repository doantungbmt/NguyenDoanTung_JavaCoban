package JavaBasic;

import java.util.Scanner;

//ba tphan sang thap luc
public class bai27 {
	public static void main(String args[])
    {
        String sobatphan, sothapluc;
        int decnum;
        Scanner key = new Scanner(System.in);
		
        System.out.print("Nhap so bat phan : ");
        sobatphan= key.nextLine();
		
        decnum = Integer.parseInt(sobatphan, 8);
        sothapluc = Integer.toHexString(decnum);
		
        System.out.print("So thap luc phan la:  "+ sothapluc+"\n");
     }
	
}
