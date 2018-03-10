package JavaBasic;

public class bai38 {
	 public static void main(String[] args) {
			String test = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
			count(test);

		}
		public static void count(String x){
			char[] ch = x.toCharArray();
			int kitu = 0;
			int khoangtrang = 0;
			int so = 0;
			int kitukhac = 0;
			for(int i = 0; i < x.length(); i++){
				if(Character.isLetter(ch[i])){
					kitu ++ ;
				}
				else if(Character.isDigit(ch[i])){
					so ++ ;
				}
				else if(Character.isSpaceChar(ch[i])){
					khoangtrang ++ ;
				}
				else{
					kitukhac ++;
				}
			}
			System.out.println("Chuoi ki tu la : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
			System.out.println("letter: " + kitu);
			System.out.println("space: " + khoangtrang);
			System.out.println("number: " + so);
			System.out.println("other: " + kitukhac);
				}
}
