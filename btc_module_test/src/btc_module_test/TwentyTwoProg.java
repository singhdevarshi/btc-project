package btc_module_test;

public class TwentyTwoProg {
	public static void main(String[] args) {
		 int x1=4,x2=4;
		 int y1=4,y2=4;
		 sqrt(x1,x2,y1,y2);
		}
		public  static void sqrt(int x1, int x2, int y1, int y2) {
		 int op;
		 op=(int) (Math.sqrt((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2)));
		 System.out.println(op);
		}
}
