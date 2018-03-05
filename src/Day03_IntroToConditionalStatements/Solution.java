package Day03_IntroToConditionalStatements;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
          
      System.out.println(Answer(n));
   }
   public static String Answer(int n){
       String ans = "Not Weird";
       if(n>=1 && n<=100){
           if(n%2 != 0 ){
               ans = "Weird";
           }else{
               if(n>=6 && n<= 20){
                   ans = "Weird";
               }
           }
       }
       return ans;
   }
}
