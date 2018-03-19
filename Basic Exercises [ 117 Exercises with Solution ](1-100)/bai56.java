package JavaBasic;

public class bai56 {
	 public static void main(String[] args){
			int x = 5;
			int y = 20;
			int p = 3;
			System.out.println(ketqua(x,y,p));
		 } 		
		public static int ketqua(int x, int y, int p) {	
			if (x%p == 0)
				return( y/p - x/p + 1);
			return(y/p - x/p);
		}
}
