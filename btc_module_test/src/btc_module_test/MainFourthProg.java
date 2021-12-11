package btc_module_test;

import java.util.*;

public class MainFourthProg {

	public static void main(String[] args) {
		FourthProj fp = new FourthProj();
		List<String> list1= new ArrayList<>();
		List<String> list2= new ArrayList<>();
		list1.add("apple");
		list1.add("grapes");
		list1.add("orange");
		list2.add("melon");
		list2.add("apple");
		list2.add("mango");
		List<String> list3=fp.operationOnList(list1, list2);
		list3.forEach((v) -> System.out.println(v));
	}

}
