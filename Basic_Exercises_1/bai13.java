package JavaBasic;

import java.util.Scanner;

public class bai13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cdai, crong, dtich,chuvi;
		System.out.println("Nhap chiu dai va chieu rong");
		Scanner key = new Scanner(System.in);
		cdai=key.nextDouble();
		crong=key.nextDouble();
		dtich=cdai*crong;
		chuvi=(cdai+crong)*2;
		System.out.println("Dien tich la: " + cdai +" * " + crong+" = "+dtich);
		System.out.println("Chu vi la " + " 2*("+cdai+" + "+crong+") "+"= "+chuvi);

	}

}
