package btc_module_test;

import java.util.*;

public class SeventhProg {
	
	public static int findOddKeyAvg(HashMap<Integer,Integer> hs1) {
		
		List<Integer>h2=new ArrayList<>();
		int length=hs1.size();
		int a[]=new int[length];
		int i=0;
		int value;
		int k=0;
			for(int key:hs1.keySet())
			{
				a[i]=key;
				i++;
			}
		for(int j=0;j<a.length;j++)
		{
			int key1=a[j];
			if((key1%2)!=0)
			{
				
				value=hs1.get(a[j]);
				h2.add(value);
			}
		}

		int length2=h2.size();
		int sum=0;
		for(int num:h2)
		{
			sum=sum+num;
		}
		return sum/length2;
	}

	public static void main(String args[]){
		
		HashMap<Integer,Integer>h1=new HashMap<>();
		
		h1.put(1,4);
		h1.put(2,6);
		h1.put(4,7);
		h1.put(5,9);
		int result = findOddKeyAvg(h1);
		System.out.println("Result = "+ result);
}
}
