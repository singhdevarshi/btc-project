package btc_module_test;

import java.util.*;

public class FourteenthProg {
	public static int averageOfOddKeyMarks(Map<Integer,Integer> mAvg){
		  int n=0,c=0;
		  Iterator<Integer> itr=mAvg.keySet().iterator();
		  while(itr.hasNext()){
		   Integer b=itr.next();
		   if(b%2!=0){
		    c++;
		    n+=mAvg.get(b);
		    } 
		   }
		  return (n/c); 
		 }
		 public static void main(String[] args) {
		  Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		  map.put(367, 89);
		  map.put(368, 98);
		  map.put(369, 92);
		  map.put(366, 74);
		  map.put(365, 67);
		  System.out.println(averageOfOddKeyMarks(map));
		 }
}
