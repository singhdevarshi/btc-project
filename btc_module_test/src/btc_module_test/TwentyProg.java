package btc_module_test;

public class TwentyProg {
	public static String ConverStringArrIntoString(String str[]) {
		StringBuffer sb=new StringBuffer();
		 for(int i=0;i<str.length;i++)
		  sb.append(str[i]).append(',');
		 sb.deleteCharAt(sb.length()-1);
		 return sb.toString();
	}
	public static void main(String[] args) {
		String[] str={"Vikas","Lokesh","Ashok"};
		 System.out.println(ConverStringArrIntoString(str));
	}
}
