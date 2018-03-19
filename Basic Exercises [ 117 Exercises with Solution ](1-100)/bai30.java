package JavaBasic;

import java.util.Scanner;

//thap luc phan sang bat phan
public class bai30 {
	public static int thaplucsangbatphan(String s)
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
        int sothapphan, i=1, j;
        int sobatphan[] = new int[100];
        Scanner key = new Scanner(System.in);
		
        System.out.print("Nhap so thap luc phan: ");
        sothapluc = key.nextLine();         
        sothapphan = thaplucsangbatphan(sothapluc);
        while(sothapphan != 0)
        {
        	sobatphan[i++] = sothapphan%8;
            sothapphan = sothapphan/8;
        }
		
        System.out.print("so bat phan la: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(sobatphan[j]);
        }
		System.out.print("\n");
    }
}
