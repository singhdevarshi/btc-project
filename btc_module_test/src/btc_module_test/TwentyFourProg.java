package btc_module_test;

public class TwentyFourProg {
	public static void main(String[] args) {
		 String s="Hello"; 
		 System.out.println(alternatingChar(s));
		}
		public static String alternatingChar(String s){
		 String st="";
		 for(int i=0;i<s.length();i++)
		  if(i%2==0)
		   st= st+(s.charAt(i));
		 return st;
		}
}
