package JavaBasic;

import java.util.Scanner;

//thap luc phan sang thap phan
public class bai28 {
	public static int thaplucsangthapphan(String s)
    {
             String so = "0123456789ABCDEF";
             s = s.toUpperCase();
             int gtri = 0;
             for (int i = 0; i < s.length(); i++)
             {
                 char c = s.charAt(i);
                 int d = so.indexOf(c);
                 gtri = 16*gtri + d;
             }
             return gtri;
    }
    public static void main(String args[])
    {
        String sothapluc;
        int sothapphan;
        Scanner key = new Scanner(System.in);
		
        System.out.print("INhap so hap luc phan: ");
        sothapluc = key.nextLine();
		
        sothapphan = thaplucsangthapphan(sothapluc);
		
        System.out.print("gia tri so thap phan la: " + sothapphan+"\n");
    }
}
