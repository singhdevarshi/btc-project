package btc_module_test;

import java.util.HashMap;

public class MainFirstProg {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstProg fp = new FirstProg();
		String state[] = {"goa","kerala","gujarat"};
		HashMap<String,String> hs2 = fp.addToHashMap(state);
		hs2.forEach((k,v)->System.out.println(k+"->"+v));
	}

}
