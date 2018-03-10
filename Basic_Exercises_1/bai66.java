package JavaBasic;

public class bai66 {
	 public static void main(String[] args)
	 {
	    int sum = 1;
		 int a = 0; 
		 int n = 0; 
	    	
			while (a < 100) {
				n++; 
				if (n % 2 != 0) { 
					if (gtri(n)) {
						sum += n; 
						a++; 
					}
				}	
			}
			System.out.println("Tong 100 so nguyen to dau tien: "+sum); 	
		 }
		
	   	public static boolean gtri(int n) {
			for (int i = 3; i * i <= n; i+= 2) {
				if (n % i == 0) {
					return false; 
				}
			}
			return true;
		}
}
