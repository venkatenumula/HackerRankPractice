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

class Result {

    /*
     * Complete the 'cookies' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY A
     */

    public static int cookies(int k, List<Integer> A) {
    // Write your code here
    	int c=0;

    	List<Integer> sl=A.stream().sorted().collect(Collectors.toList());
    	int a=sl.get(0),b,s;
    	if(a>k)
    		return 0;
    	if(A.stream().mapToInt(Integer::intValue).sum()<k)
    		return -1;
    	
    	while(sl.get(0)<=k)
    	{   
    		a=sl.get(0);
    		b=sl.get(1);
    		s=a+2*b;
    		sl.remove(0);
    		sl.remove(0);
    		sl.add(s);
    		//System.out.println(sl);
    		sl=sl.stream().sorted().collect(Collectors.toList());
    		c++;
    		//System.out.println(s+" "+c+" iteration :"+sl);
    	}
    	System.out.println(c);
     return c;

    }

}

public class JesseCookies {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> A = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.cookies(k, A);

        bufferedReader.close();
       // bufferedWriter.close();
    }
}

