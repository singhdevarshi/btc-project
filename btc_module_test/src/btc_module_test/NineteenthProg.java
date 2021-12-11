package btc_module_test;

public class NineteenthProg {
	public static void getIntegerSum(String[] str) {
		 int sum=0;
		 for(int i=0;i<str.length;i++)
		  for(int j=0;j<str[i].length();j++){
		   char ch=str[i].charAt(j);
		   if(Character.isDigit(ch)){
		    String st=String.valueOf(ch);
		    int n=Integer.parseInt(st);
		    sum=sum+n; 
		    }
		   }
		 System.out.println(sum);
		 }
	public static void main(String[] args) {
		String str[] = {"2AA","12","ABC","C1a"};
		getIntegerSum(str);
	}
}
