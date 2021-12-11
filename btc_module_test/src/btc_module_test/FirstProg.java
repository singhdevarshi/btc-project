package btc_module_test;

import java.util.HashMap;

public class FirstProg {
	HashMap<String,String> hs = new HashMap<>();
	
	public HashMap<String, String> addToHashMap(String[] str)
	{
		HashMap<String,String> hsadd = new HashMap<>();
		String key1="",key2="";
		for(int i=0;i<str.length;i++)
		{
			key1=str[i];
			key2=key1.substring(0,3);
			hsadd.put(key2.toUpperCase(),str[i]);
		}
		
		return hsadd;
		
	}
}
