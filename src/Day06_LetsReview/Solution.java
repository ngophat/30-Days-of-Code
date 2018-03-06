package Day06_LetsReview;

import java.util.Scanner;

public class Solution {
	private int n;
	private StringBuilder sb = new StringBuilder();
	private static Scanner scanner = new Scanner(System.in);
	
	public Solution(int n) {
		if(n>=1 && n<=10) {
			this.n=n;
		}else {
			n=0;
			System.out.println("n is invalid, set n = "+n);
		}
	}

	private StringBuilder solution() {
		String s;		
		for(int i=0;i<n;i++) {
			String sEven="";
			String sOdd="";
			s = scanner.nextLine();
			for(int j =0; j<s.length();j++) {
				if(j%2==0) {
					sEven = sEven + s.charAt(j);
				}else {
					sOdd = sOdd + s.charAt(j);
				}
			}
			sb.append(sEven+" "+sOdd+"\n");
		}
		return sb;
	}
	
	private void prints() {
		System.out.println(solution());
	}
	
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n = Integer.parseInt(scanner.nextLine());
        Solution solu = new Solution(n);
        solu.prints();
    }
}
