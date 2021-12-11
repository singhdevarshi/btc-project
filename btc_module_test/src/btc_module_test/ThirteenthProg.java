package btc_module_test;

import java.util.*;

public class ThirteenthProg {
	public static int sumOfPalindrome(int n1,int n2) {
		List<Integer> list = new ArrayList<>();
		for(int i=n1;i<=n2;i++) {
			int r=0,n3=i;
			while(n3!=0) {
				r=(r*10)+(n3%10);
				n3=n3/10;
			}
				if(r==i) 
					list.add(i);
		}
				
		int sum=0;
		for(int i=0;i<list.size();i++) {
			sum += list.get(i);
			}
		return sum;
	}
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the range:");
		  int n1=sc.nextInt();
		  int n2=sc.nextInt();
		  System.out.println("sum of palindrome nos.within given range is:"+sumOfPalindrome(n1,n2));
		 }
}
