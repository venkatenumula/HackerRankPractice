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

class Result11 {

    /*
     * Complete the 'balancedSums' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

	  public static String balancedSums(List<Integer> arr) {
	        // Write your code here
	    	String ans="NO";
	    	
	    	if(arr.size()<=1)
	    		return "YES";
	    	
	    	for(int i=0;i<arr.size()-1;i++)
	    	{
	    		int s1=arr.subList(0, i).stream().mapToInt(Integer::intValue).sum();
	    		int s2=arr.subList(i+1, arr.size()).stream().mapToInt(Integer::intValue).sum();
	    		System.out.println(arr.subList(0, i) + " - "+arr.subList(i+1, arr.size()));
	    		if(s1==s2)
	    			return "YES";
	    	}	    		    	
	    	return ans;	    	
	        }

}

public class SherlockArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        for (int TItr = 0; TItr < T; TItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrTemp[i]);
                arr.add(arrItem);
            }

            String result = Result11.balancedSums(arr);
            System.out.println(result);

        }

        bufferedReader.close();
    }
}

