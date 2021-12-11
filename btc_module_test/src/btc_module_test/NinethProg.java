package btc_module_test;

import java.util.Arrays;
import java.util.*;

public class NinethProg {
	public static String operationOnString(String str[],int n) {
		Arrays.sort(str);
		System.out.println("After sorting Array "+Arrays.toString(str));  
		 List<String> list = Arrays.asList(str);
	        Collections.reverse(list);
	        String[] reversedArray = list.toArray(str);
	        System.out.print("Reverse Array : " + Arrays.toString(reversedArray));
	        if(n==1) {
	        	return reversedArray[n-1];
	        }
	        else
	        	return null;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s={"red","green","blue","ivory","yellow"};
		System.out.println("Enter the no.");
		 int n= sc.nextInt();
		 System.out.println(operationOnString(s, n));
	}
}
