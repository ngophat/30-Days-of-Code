package Day08_DictionariesAndMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	public static void main(String []argh){
        StringBuilder sb= new StringBuilder();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            map.put(name, phone);
        }
        while(n>0) {        	
        	String s = in.next();
            if(map.containsKey(s) == true) {
            	sb.append(s+"="+map.get(s)+"\n");
            }else {
            	sb.append("Not found\n");
            }    
            n--;
        }
        System.out.println(sb);
    }
}
