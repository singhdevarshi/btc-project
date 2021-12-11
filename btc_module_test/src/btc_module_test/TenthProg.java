package btc_module_test;

import java.util.*;

public class TenthProg {
	public static void mergeCommonAndSum(int n1[],int n2[]) {
			Set<Integer> hashSet = new HashSet<Integer>(Arrays.asList(1,2,3,4,5));
			Set<Integer> common = new HashSet<>();
			
			 for (int i = 0; i < n2.length; i++) {
		            if (hashSet.contains(n2[i])) {
		                common.add(n2[i]);
		            }
		        }
			 Integer integerSum = common.stream().mapToInt(Integer::intValue).sum();
			 System.out.println("summation: " + integerSum);
	}
	
	public static void main(String[] args) {
		int n1[] = {1,2,3,4,5};
		int n2[] = {1,3,5};
		mergeCommonAndSum(n1, n2);
	}
}
