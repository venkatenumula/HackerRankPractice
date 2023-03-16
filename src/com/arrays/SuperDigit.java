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

class Result8 {

    /*
     * Complete the 'superDigit' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING n
     *  2. INTEGER k
     */

   public static int superDigit(String n, int k)  {
        // Write your code here
	   if(n.length()==1 )
		   return Integer.parseInt(n) ;
	   else
	   {
	   
        Long ans=0L ;
        for(int i=0;i<n.length();i++)
        {
            ans+=Integer.parseInt(""+n.charAt(i));
        }
        System.out.println("ans "+ans);
        n=""+ans;
        
        return superDigit( Long.toString(ans*k) ,1);
        
	   }
     }

}

public class SuperDigit {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        String n = firstMultipleInput[0];

        int k = Integer.parseInt(firstMultipleInput[1]);

        int result = Result8.superDigit(n, k);
        System.out.println(result);

       

        bufferedReader.close();
    }
}

