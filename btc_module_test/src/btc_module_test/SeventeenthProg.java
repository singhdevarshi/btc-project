package btc_module_test;

import java.util.*;

public class SeventeenthProg {
	public static int countNoOfElement(List<String> lst, String st) {
		int length = lst.size();
		String st1="";
		for(int i=0;i<length;i++) {
			if(lst.get(i)==st) {
				st1=st;
				return st1.length();
			
			}
		}
		return 0;
	}
	
	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("aaa");
		lst.add("bb");
		lst.add("ccc");
		lst.add("d");
		String st ="aaa";
		System.out.println(st +" -> " +countNoOfElement(lst, st));
	}
}
