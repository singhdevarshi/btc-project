package btc_module_test;

import java.util.StringTokenizer;

public class TwentyOneProg {
	public static boolean emailIdValidator(String str) {
		 int i=0;
		 boolean b=false;
		 StringTokenizer stk = new StringTokenizer(str,"@");
		 String str1 = stk.nextToken();
		 String str2 = stk.nextToken();
		 StringTokenizer stk1 = new StringTokenizer(str2,".");
		 String str3 = stk1.nextToken();
		 String str4 = stk1.nextToken();
		 if(str.contains("@") && str.contains("."))
			  i++;
		 
		 if(i==1)
			 if(str3.length()==5)
				 if(str1.length()>=3)
					 if(str4.equals("com"))
						 b=true;
		 return b;
		}
	
	public static void main(String[] args) {
		String str="test@gmail.com";
		 boolean b=emailIdValidator(str);
		 if(b==true)
		  System.out.println("Valid Mail Id");
		 else
		  System.out.println("Invalid Mail Id");
	}
}
