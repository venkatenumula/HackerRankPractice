package com.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result5 {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {
    // Write your code here
     String cyper="";
     k=k%26;
     
     Integer it=new Integer(9);
     System.out.println(it);
     it=new Integer(7);
     
     IntStream ss=cyper.chars();
     
     for(int i=0;i<s.length();i++)
     {
    	 char c=s.charAt(i);
    	 int x=0;
    	 if( ( c >=97 && c <=122 ) )
    	 {
    		 x=(c+k)>=123 ? (c+k)-26 :(c+k);
    		 cyper+=(char)x;
    		 
    	 }
    	 else if(( c >=65 && c <=90 ))
    	 {
    		 x=(c+k)>=91 ? (c+k)-26:(c+k);
    		 cyper+=(char)x;
    	 }
    	 else
    		 cyper+=c;
    	 
    	 //System.out.println(c+" --> "+x+"="+(char)x);
     }
     System.out.println(cyper);
     
     return cyper;

    }
    public static long sumXor(long n) {
        // Write your code here
        
        long c=0;
        while(n>0)
        {
            if(n%2==0)
            	c*=2;
            
            n=n>>1;
            
        }
        return c;

        }

}

public class Cipher {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String s = bufferedReader.readLine();

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result5.caesarCipher(s, k);

        bufferedReader.close();

    }
}
