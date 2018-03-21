package Java_Conditional_Statement_Exercises_32_exercises_with_solution;

import java.util.Scanner;

public class bai21 {
	public static void main(String[] args){
	   System.out.print("Nhap so dong(mot nua vien kim cuong): ");
	   Scanner key = new Scanner(System.in);
	   int r = key.nextInt();
	   int i,j;
	   for(i=0;i<=r;i++){
		   for(j=1;j<=r-i;j++)
			   System.out.print(" ");
		   for(j=1;j<=2*i-1;j++)
			   System.out.print("*");
		   System.out.print("\n");
		   }
	 
	   for(i=r-1;i>=1;i--){
		   for(j=1;j<=r-i;j++)
			   System.out.print(" ");
		   for(j=1;j<=2*i-1;j++)
			   System.out.print("*");
		   System.out.print("\n");
	   		}
	 
	}
}
