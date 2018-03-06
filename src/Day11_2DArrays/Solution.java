package Day11_2DArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int arr[][] = new int[6][6];
	        for(int i=0; i < 6; i++){
	            for(int j=0; j < 6; j++){
	                arr[i][j] = in.nextInt();
	            }
	        }
	          
	        //Solution
	        int iSum;
	        List<Integer> list = new ArrayList<>();
	        for(int i=0; i<4;i++) {
	        	for(int j=0;j<4;j++) {
	        		iSum=arr[i][j] + arr[i][j+1] + arr[i][j+2]+
	        								+ arr[i+1][j+1]+
	        			+arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
	        		list.add(iSum);
	        	}
	        }
	        
	        int iMax=list.get(0);
	        for(int i=1;i<list.size();i++) {
	        	iMax = Math.max(iMax, list.get(i));
	        }
	        System.out.println(iMax);
	    }
}
