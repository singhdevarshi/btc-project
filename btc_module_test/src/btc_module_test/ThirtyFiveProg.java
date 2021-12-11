package btc_module_test;

import java.util.StringTokenizer;

public class ThirtyFiveProg {
	public static String maxLengthString(String str1) {
		 int max=0;
		 String str2=new String();
		 StringTokenizer t=new StringTokenizer(str1," ");
		 
		 while(t.hasMoreTokens()){
		  String s3=t.nextToken();
		  int n=s3.length();
		  if(n>max){
		   max=n;
		   str2=s3;
		   }
		  if(n==max)
		   for(int i=0;i<s3.length();i++){
		    char c1=str2.charAt(i);
		    char c2=s3.charAt(i);
		    if(c1!=c2){    
		     if(c2<c1)
		      str2=s3;
		     }   
		    }
		 }
		 return str2;
		}
	public static void main(String[] args) {
		 String s1="Honesty is my best policy abcetqk"; 
		 System.out.println(maxLengthString(s1));
		}
}
