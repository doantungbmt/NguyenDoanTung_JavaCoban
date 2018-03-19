package JavaBasic;

public class bai98 {
	public static void main(String[] args)
	 {
		int[] mang = {10, 20, 10, 20, 40, 13, 20};
			
		int dem = 0, ketqua =0;
	    
	    if(mang.length >= 1 && mang[0] == 20)
	    	dem++;

	    for(int i = 1; i < mang.length; i++) {
	        if(mang[i - 1] == 20 && mang[i] == 20)
			{
	         System.out.println( String.valueOf(false));	
	         ketqua = 1;
			}                   
	        if(mang[i] == 20)
	        	dem++;
	    }
	                                          
	    if (ketqua==0)
	 	  {
	     	 System.out.println( String.valueOf(dem == 3));	         
		  }	
	    }
}	
