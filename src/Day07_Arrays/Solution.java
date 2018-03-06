package Day07_Arrays;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        Reverse(arr);
        in.close();
    }
    private static void Reverse(int[] arr) {
		int a[]= new int[arr.length];
		for(int i=0 ; i<arr.length ; i++) {
			a[i]=arr[arr.length -(i+1)];
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(a[j]+" ");
		}
	}
}
