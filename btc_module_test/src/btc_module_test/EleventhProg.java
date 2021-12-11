package btc_module_test;

public class EleventhProg {
	public static int[] retrievePositionAndMerge(int[] n1,int[] n2){
		  int[] c=new int[n1.length];
		  
		  for(int i=0;i<n1.length;i++)
		  {
		   if(i%2==0)
		    c[i]=n2[i];
		   if(i%2!=0)
		    c[i]=n1[i];
		   }
		  return c;
		 }
		 public static void main(String[] args) {
		  int[] n1={12,1,32,3};
		  int[] n2={0,12,2,23};
		  int[] n3=retrievePositionAndMerge(n1,n2);
		  for(int d:n3)
		   System.out.println(d);
		 }
}
