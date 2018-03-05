package Day01_DataTypes;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
/* Declare second integer, double, and String variables. */
        
        int inte = Integer.parseInt(scan.nextLine());
		double doub = Double.parseDouble(scan.nextLine());
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder();
         
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        int iPlus = i + inte;
        double dPlus = d + doub;
        sb.append(s + str);
        /* Print the sum of both integer variables on a new line. */
        System.out.println(iPlus);
        /* Print the sum of the double variables on a new line. */
		System.out.println(dPlus);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(sb);

        
        scan.close();
    }
}
