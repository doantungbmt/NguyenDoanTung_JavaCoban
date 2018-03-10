package JavaBasic;

public class bai96 {
	public static void main(String[] args)
	 {
		  int[] mangso = {10, 70, 80, 50, 20, 13, 50};
	      boolean testd = false;
		  int ketqua=0;
		  int x = 10;
		  int y = 20;
	    
	    for(int i = 0; i < mangso.length; i++) {
	        if(mangso[i] == x)
	            testd = true;
	                    
	        if(testd && mangso[i] == y)
			{
	         System.out.println( String.valueOf(true));	
	         ketqua = 1		 ;
			}
	    }
	     if (ketqua==0)                             
		   {	 
	         System.out.println( String.valueOf(false));
		    }
	    }
}
