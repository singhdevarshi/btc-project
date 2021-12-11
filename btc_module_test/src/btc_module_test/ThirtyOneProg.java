package btc_module_test;

import java.util.*;

public class ThirtyOneProg {
	public static boolean passwordValidator(String str) {
		 boolean b=false,b1=false,b2=false;
		 if(str.length()>=8)
		  if(!Character.isDigit(str.charAt(0)))
		   if(str.charAt(0)!='@' && str.charAt(0)!='_' && str.charAt(0)!='#')
		    if(str.charAt(str.length()-1)!='@' && str.charAt(str.length()-1)!='_' && str.charAt(str.length()-1)!='#')
		     b1=true;
		 if(b1==true)
		  for(int i=0;i<str.length();i++)
		   if(Character.isAlphabetic(str.charAt(i)) || Character.isDigit(str.charAt(i)) || str.charAt(i)=='#' || str.charAt(i)=='@' || str.charAt(i)=='_')
		    b2=true;
		 if(b2==true)
		  if(str.contains("#") || str.contains("@") || str.contains("_"))
		   b=true;
		 return b;
		}
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Passwoed :");
		 String str=sc.next();
		 boolean result=passwordValidator(str);
		 if(result==true)
		  System.out.println("Valid password");
		 else
		  System.out.println("Invalid password");
		}
}
