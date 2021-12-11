package btc_module_test;

public class TwentyFiveProg {
	public static String swapFirstToLast(String str) {
		char ch[] = str.toCharArray();
		int f=0;
		for(int i=0;i<ch.length;i++) {
			if(i==0 && ch[i]!=' ' ) {
				f=i;
			}
			if(i>=ch.length-1 && ch[i]!=' ' ) {
				char t = ch[i];
				ch[i]=ch[f];
				ch[f]=t;
			}
		}
		return new String(ch);
	}
	
	public static void main(String[] args) {
		
		String st ="Hello World";
		System.out.println(swapFirstToLast(st));
	}
}
