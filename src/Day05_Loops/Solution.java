package Day05_Loops;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	private int n;
	public Solution(int n) {
		if(n <=20 && n>=2) {
			this.n = n;
		}else {
			this.n = 0;
		}
	}
	
	private void loop() {
		int result;
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<=10;i++) {
			result = n*i;
			sb.append(n+" x "+i+" = "+result+"\n");
		}
		System.out.println(sb);
	}
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    Solution solution = new Solution(n);
	    solution.loop();
	}
}
