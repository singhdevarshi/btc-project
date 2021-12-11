package btc_module_test;

public class FifthProg {
	public static boolean  characterMatching(String str) {
		char ch[] = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='*' && i< ch.length-1) {
				if(ch[i-1]==ch[i+1]) {
					return true;
				}
				else
					return false;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		String str = "hello*orld";
		boolean value = characterMatching(str);
		System.out.println(value);
	}
}
