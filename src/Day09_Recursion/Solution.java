package Day09_Recursion;

import java.util.Scanner;

public class Solution {
	static int factorial(int n) {
		int result=n;
		if(n>1) {
			result = result*factorial(n-1);
		}
        return result;
    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int result = factorial(n);
    System.out.println(result);
    }
}
