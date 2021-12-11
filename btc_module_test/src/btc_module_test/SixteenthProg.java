package btc_module_test;

import java.util.*;

public class SixteenthProg {
	public static void main(String args[])
	{
	String str1, str2 ="";
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the string : ");
	str1 = sc.nextLine();
	int n = str1.length();
	int count=0;
	for(int i = n - 1; i >= 0; i--)
	{
	str2 = str2 + str1.charAt(i);
	if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i' || str1.charAt(i)=='o' || str1.charAt(i)=='u' )
		count++;
	}
	
	if(count>=2) {
	if(str1.equalsIgnoreCase(str2))
	{
	System.out.println("The string is a palindrome");
	}
	else
	{
	System.out.println("The string is not a palindrome");
	}
	}
	else {
		System.out.println("false(no 2 vowels)");
	}
	}
}
