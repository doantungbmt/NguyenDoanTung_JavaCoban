package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

public class bai22 {
	public static void main(String[] args){
	    System.out.print("Nhap so dong: ");
	    Scanner key = new Scanner(System.in);
		int sodong = key.nextInt();
		int c=1,blk,i,j;
		for(i=0;i<sodong;i++){
			for(blk=1;blk<=sodong-i;blk++)
				System.out.print(" ");
			for(j=0;j<=i;j++){
				if (j==0||i==0)
					c=1;
	            else
	            	c=c*(i-j+1)/j;
				System.out.print(" "+c);
				}
			System.out.print("\n");
	    }
	}
}
