package btc_module_test;

import java.util.*;

public class SixthProg {
	public static HashMap<String,String> convertToResult(HashMap<String,Integer> hsm){
		HashMap<String,String> resultMap = new HashMap<String,String>();
		int j=0;
		String str[] = new String[hsm.size()];
		
		for(String key : hsm.keySet()) {
			str[j]=key;
			j++;
		}
		for(int i=0;i< str.length;i++) {
			int value = hsm.get(str[i]);
			if(value>60) {
				resultMap.put(str[i], "pass");
			}
			if(value<=60) {
				resultMap.put(str[i], "fail");
			}
		}
		return resultMap;
	}
	public static void main(String[] args) {
		HashMap<String,Integer> h1=new HashMap<>();
		h1.put("abc",50);
		h1.put("efg",70);
		h1.put("xyz",50);
		HashMap<String,String> result = convertToResult(h1);
		result.forEach((k,v)->System.out.println(k+" -> "+v));
	}
}
