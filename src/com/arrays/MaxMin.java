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

class Result9 {

    /*
     * Complete the 'maxMin' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY arr
     */

    public static int maxMin(int k, List<Integer> arr) {
    // Write your code here
    	int min=Integer.MAX_VALUE;
    	long start=System.currentTimeMillis();
        Collections.sort(arr);
        String x="Venkat";
    	
    	for(int i=0;i<=arr.size()-k;i++ )
    	{
    		int dif=arr.get(i+k-1)-arr.get(i);
    		if(dif<min)
    			min=dif;	   		
    		//System.out.println(sub +"diff "+dif);
    	}
    	System.out.println((System.currentTimeMillis()-start) +" Milli secs" );
    	return min;
    }
    
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr);
        BigInteger sum=BigInteger.valueOf( arr.stream().mapToInt(Integer::intValue ).sum());
        System.out.println(sum.add(BigInteger.valueOf(arr.get(0))) +" "+(sum.add(BigInteger.valueOf(arr.get(arr.size()-1))))) ;
        }

}

public class MaxMin {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result9.maxMin(k, arr);
        System.out.println("result : "+result);

       
        bufferedReader.close();
    }
}
