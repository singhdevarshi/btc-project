package btc_module_test;

import java.util.*;

public class TwelfthProg {
	public static String retrieveMaxScoredStudent(String[] str1){
		  Map<String, Integer> m1=new HashMap<String, Integer>();
		  for(int i=0;i<str1.length;i++){
		   String str2=str1[i]; 
		   StringTokenizer t=new StringTokenizer(str2,"#");
		   String str3=t.nextToken();
		   int n1=Integer.parseInt(t.nextToken());
		   int n2=Integer.parseInt(t.nextToken());
		   int n3=Integer.parseInt(t.nextToken());
		   int n=n1+n2+n3;
		   m1.put(str3, n);
		   }
		  
		  int max=0;
		  String m=new String();
		  Iterator<String> itr=m1.keySet().iterator();
		  while(itr.hasNext()){
		   String str4=itr.next();
		   int j=m1.get(str4);
		   if(j>max){
		    max=j;
		    m=str4; }
		  }
		  return m;
		 }
		
}
