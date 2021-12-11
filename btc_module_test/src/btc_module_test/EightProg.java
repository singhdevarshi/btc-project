package btc_module_test;

import java.util.*;

public class EightProg {
	public static List<Integer> mergeZigZag(List<Integer> l1,List<Integer> l2){
		List<Integer> l3 =new ArrayList<Integer>();
		int length1 = l1.size();
		int length2 = l2.size();
		if(length1!=length2) {
			System.out.println("Lengths are not equal");
			return null;
		}
		else {
			for(int i=0;i<length1;i++) {
				if(i%2==0) {
					l3.add((Integer) l2.get(i));
				}
				else {
					l3.add((Integer) l1.get(i));
				}
			}
		}
		return l3;
	}
	
	public static void main(String[] args) {
		List<Integer> h1=new ArrayList<>();
		List<Integer> h2=new ArrayList<>();
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(4);
		h1.add(5);
		h2.add(6);
		h2.add(7);
		h2.add(8);
		h2.add(9);
		h2.add(10);
		List<Integer> h3=mergeZigZag(h1, h2);
		h3.forEach((v)->System.out.println(v));
	}
}
