package btc_module_test;

public class FifteenthProg {
	static int getSum(int n)
	{
		int sum = 0;

		while (n != 0) {
			int r = n % 10;
			sum = sum + r*r;
			n = n / 10;
		}

		return sum;
	}

	
	public static void main(String[] args)
	{
		int n = 125;

		System.out.println(getSum(n));
	}
}
