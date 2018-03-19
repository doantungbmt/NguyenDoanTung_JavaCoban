package JavaBasic;

public class bai97 {
	 public static void main(String[] args)
	 {
		  int[] mang = {10, 20, 10, 50, 20, 13, 50};
	      boolean testd = false;
		  int ketqua=0;
		  int x = 10;
		      
		for(int i = 0; i < mang.length - 1; i++) {
	        if(mang[i] == x && mang[i+1] == x)
	            {
	         System.out.println( String.valueOf(true));	
	         ketqua = 1 ;
			}
	                  
	        if(i <= mang.length - 3 && mang[i] == x && mang[i+2] == x)
	           {
	         System.out.println( String.valueOf(true));	
	         ketqua = 1 ;
			}
	    }
		
		 if (ketqua==0)                             
		   {	 
	         System.out.println( String.valueOf(false));
		    }
			
	    }
}
