package btc_module_test;

public class ThirtyThreeProg {
	public static void main(String[] args) {
		 String str="this was great";
		 System.out.println(checkFirstAndLastChar(str));
		}
		public static int checkFirstAndLastChar(String str) {
		 int n=0;
		 if(str.charAt(0)==str.charAt(str.length()-1))
		  n=1;
		 else n=-1;
		 return n;
		}
}
