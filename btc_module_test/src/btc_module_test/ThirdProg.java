package btc_module_test;

import java.util.*;

public class ThirdProg {
	public List<Integer> collectDiffNo(List<Integer> list1,List<Integer>list2){
		List<Integer> li = new ArrayList<Integer>();
		  int length1=list1.size();
		  int length2=list2.size();
		  for(int i=0;i<length2;i++)
		  {
			  int value=list2.get(i);
			  if(list1.contains(value))
			  {
				 
			  }
			  else {
				  li.add(value);
			  }
		  }
		  for(int i=0;i<length1;i++)
		  {
			  int value=list1.get(i);
			  if(list2.contains(value))
			  {
				 
			  }
			  else {
				  li.add(value);
			  }
		  }
		return li;
		
	}
	
}
