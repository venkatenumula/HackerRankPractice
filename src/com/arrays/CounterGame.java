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

class Result4 {

    /*
     * Complete the 'counterGame' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static String counterGame(long n) {
    // Write your code here
    	int c=0;
    	
    	while(n!=1)
    	{
    		if(is2Power(n))
    		 n=n/2;
    		else
    		 n=n-getNear2Power(n);
    		
    		c++;   		
    	}
    	System.out.println(c);
    	return c%2==1?"Louise":"Richard";

    }
    
    static boolean is2Power(long x)
    {
    	System.out.println(x+" is is2Power " + ((x & x-1) ==0 ));
    	return (x & x-1) ==0;
    }
    
    static long getNear2Power(long n)
    {
        long x=1;
        while(x<n)
        {
        	x=x*2;
        }
        System.out.println(n+" 's near 2 power is "+x/2);
    	return x/2;
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int c=0;
        List<Integer> dis=ar.stream().distinct().collect(Collectors.toList()); ;
        
        for(int i : dis )
        {
        	c+=ar.stream().filter(e-> e==i).count()/2;
            
        }
        
        return c;

        }

}

public class CounterGame {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());

                String result = Result4.counterGame(n);
                System.out.println(result);

              
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
       
    }
}

