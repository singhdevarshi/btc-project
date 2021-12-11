package btc_module_test;

import java.util.*;

public class MainThirdProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThirdProg tp = new ThirdProg();
		 List<Integer>list1=new ArrayList<>();
		  List<Integer>list2=new ArrayList<>();
		  List<Integer>output1=new ArrayList<>();
		  
		  list1.add(1);
		  list1.add(2);
		  list1.add(3);
		  list1.add(4);
			 
		  list2.add(1);
		  list2.add(2);
		  list2.add(3);
		  list2.add(5);
		  output1=tp.collectDiffNo(list1,list2);
		  output1.forEach((v)->System.out.print(v+" "));
	}

}
