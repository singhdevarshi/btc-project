package btc_module_test;

import java.util.*;

public class FourthProj {
	public List<String> operationOnList(List<String> list1,List<String> list2) {
		int length1 = list1.size();
		int length2 = list2.size();
		List<String> lst = new ArrayList<>();
		
		for(int i=0;i<length1;i++) {
			String str1 = list1.get(i);
			if(str1.startsWith("a") || str1.startsWith("g") || str1.startsWith("A") || str1.startsWith("G")) {
				list1.remove(i);
				length1=length1-1;
			}
			else {
				lst.add(str1);			}
			}
		for(int i=0;i<length2;i++) {
			String str2 = list2.get(i);
			if(str2.endsWith("n") || str2.endsWith("e") || str2.endsWith("N") || str2.endsWith("E")) {
				list2.remove(i);
				length2=length2-1;
			}
			else {
				lst.add(str2);
			}
			}
		return lst;
	}
}
