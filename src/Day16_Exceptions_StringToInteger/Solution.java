package Day16_Exceptions_StringToInteger;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        try {
			System.out.println(Integer.parseInt(s));
		} catch(Exception e){
			System.out.println("Bad String");
		}
    }
}
