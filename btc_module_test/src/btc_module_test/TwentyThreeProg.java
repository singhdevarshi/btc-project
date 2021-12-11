package btc_module_test;

import java.util.ArrayList;

public class TwentyThreeProg {
	public static void main(String[] args) {
		 String[] str={"100","111","10100","10","1111"};
		 getCount(str);
		}
		public static void getCount(String[] str) {
		 int count=0;
		 ArrayList<String> l1=new ArrayList<String>();
		 for(String s:str)
		  if(s.startsWith("10") || s.startsWith("01") &&(s.length()>2))
		   l1.add(s);
		 count=l1.size();
		 System.out.println(count);
		}
}
