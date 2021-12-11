package btc_module_test;

import java.util.*;

public class TwentySevenProg {
	public static String[] reverseConvertLowerCase(String str,char ch) {
		List<String> lst = new ArrayList<>();
		StringTokenizer tk = new StringTokenizer(str,"/");
		while(tk.hasMoreTokens()) {
			StringBuffer s = new StringBuffer(tk.nextToken().toLowerCase());
			lst.add(s.reverse().toString());		
		}
		String[] result = new String[lst.size()];
		for(int i=0;i<result.length;i++) {
			result[i]=lst.get(i);
		}
		return result;	
	}
	public static void main(String[] args) {
		 String str1="AAA/abb/CCC";
		 char ch='/';
		 String result[]=reverseConvertLowerCase(str1, ch);
		 for(String s:result)
		 System.out.println(s);
		}
}
