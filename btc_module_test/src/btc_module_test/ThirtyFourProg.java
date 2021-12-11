package btc_module_test;

public class ThirtyFourProg {
	public static void main(String[] args) {
		 String str2="hello";
		 String str1="helloworld";
		 System.out.println(removeCharAndConcateString(str1,str2));
		}
		public static String removeCharAndConcateString(String ip1,String ip2){
		 String st = "";
		 int n1=ip1.length();
		 int n2=ip2.length();
		 if(n1<n2) {
		  st=st+(ip2.substring(n1, n2))+(ip1);
		 return st;
		 }
		 else if(n1>n2) {
			 st =st+(ip1.substring(n2, n1))+(ip2);
			 return st;
		 }
		 else {
			 st =st+(ip2.substring(0, n2))+(ip1);
		return st;
		 }
		}
}
