package btc_module_test;

public class TwentyEightProg {
	public static void main(String[] args) {
		 String ip1="bow";
		 String ip2="so";
		 System.out.println(dependingOncharCount(ip1,ip2));
		}
		public static String dependingOncharCount(String str1,String str2) {
		 StringBuffer sb=new StringBuffer();
		 int n1=str1.length();
		 int n2=str2.length();
		 if(n1==3)
		  for(int i=0;i<n1-1;i++)
		   sb.append(str1.substring(0, n1));
		 
		 sb.append(" ");
		 if(n2==2)
		  for(int i=0;i<n2+1;i++)
		   sb.append(str2.substring(0, n2));
		 return sb.toString();
		}
}
