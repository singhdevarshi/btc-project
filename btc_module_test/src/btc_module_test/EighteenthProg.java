package btc_module_test;

public class EighteenthProg {
	public static int[] removeGivenElement(int arr[],int n) {
		int length = arr.length;
		int brr[] = new int[length-1];
		int j=0;
		for(int i=0;i<length;i++) {
			if(arr[i]!=n) {
				brr[j]=arr[i];
				j++;
			}
		}
		return brr;
	}
	public static void main(String[] args) {
		int arr[] = {10,10,20,30,100};
		int n=20;
		int brr[] = removeGivenElement(arr, n);
		for(int i=0;i<brr.length;i++) {
			System.out.println(brr[i]);
		}
	}
}
