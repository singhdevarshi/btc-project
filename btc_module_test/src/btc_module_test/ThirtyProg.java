package btc_module_test;

public class ThirtyProg {
	
		public static boolean isISBNnumber(String str) {
		 boolean b=false;
		 int sum=0;
		 for(int i=0,j=str.length();i<str.length();i++,j--){
		  String s=String.valueOf(str.charAt(i));
		  int n=Integer.parseInt(s);
		  sum+=(n*j); 
		  }

		 if(sum%11==0)
		  b=true;
		 return b;
		}
		public static void main(String[] args) {
			 String str="0201103311";
			 boolean b=isISBNnumber(str);
			 if(b==true)
			  System.out.println("Valid ISBN number");
			 else
			  System.out.println("Invalid ISBN number");
			}
}
