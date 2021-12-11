package btc_module_test;

import java.util.HashMap;

public class MainSecondProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondProg sp = new SecondProg();
		HashMap<String,String> hs1 = new HashMap<String,String>();
		hs1.put("ram","hari");
		hs1.put("cisco","barfi");
		 hs1.put("honeywell","cs");
		 hs1.put("cts","hari");
		 String s2="hari";
		 sp.getvalues(hs1,s2);
	}

}
