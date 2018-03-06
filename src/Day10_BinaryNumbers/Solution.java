package Day10_BinaryNumbers;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
         *  Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		Integer n = in.nextInt();
		String s = n.toBinaryString(n);
		int j=0;
		int jCount=0;
		for(int i=0;i<s.length();i++) {			
			if(s.charAt(i)=='1') {
				jCount++;
				if(jCount>=j) {
					j=jCount;
				}
			}else {
				jCount=0;
			}
		}
		System.out.println(j);
    }
}