package btc_module_test;

import java.util.Scanner;

public class ThirtyTwoProg {
	public static boolean panNoValidator(String pan) {
		 boolean b=false,b1=false,b2=false;
		 String str1=pan.substring(0, 3);
		 String str2=pan.substring(3, 7);
		 if(pan.length()==8)
		  if(Character.isAlphabetic(pan.charAt(pan.length()-1)) && Character.isUpperCase(pan.charAt(pan.length()-1)))
		   b1=true;
		 if(b1==true)
		  for(int i=0;i<str1.length();i++)
		   if(Character.isAlphabetic(str1.charAt(i)) && Character.isUpperCase(str1.charAt(i)))
		    b2=true;
		   else
		    {b2=false;break;}
		 
		 if(b2==true)
		  for(int i=0;i<str2.length();i++)
		   if(Character.isDigit(str2.charAt(i)))
		    b=true;
		   else{
			   b=false;break;
			   }
		 return b;
		}
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Pan Card Number :");
		 String pan=sc.next();
		 boolean b=panNoValidator(pan);
		 if(b==true)
		  System.out.println("Valid Pan Card No.");
		 else
		  System.out.println("Invalid Pan Card No.");
		}
}
