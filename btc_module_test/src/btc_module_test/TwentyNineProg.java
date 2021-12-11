package btc_module_test;

public class TwentyNineProg {
	public static void main(String[] args) {
		 String s1="hello";
		 int n1=2;
		 System.out.println(findSubStringOfString(s1,n1));
		}
		public static String findSubStringOfString(String s1, int n1) {
		 String s2=s1.substring(s1.length()-n1, s1.length());
		 String st ="";
		 for(int i=0;i<n1;i++)
		  st = st+(s2);
		 return st;
		}
}
