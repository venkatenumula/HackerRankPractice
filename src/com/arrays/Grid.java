package com.arrays;

import java.io.*;
import java.lang.reflect.Array;
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

class Result10 {

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
    // Write your code here
    	int n=grid.size();
    	
    	char[][] charr=new char[n][n];
    	List<List<Character>> lst=new ArrayList<>();
    	
    	
    	String ans="YES";
    	
    	for(int i=0;i<n;i++)
    	{
    		charr[i]=grid.get(i).toCharArray();
    		Arrays.sort(charr[i]);
    	}   	
    	for(int i=0;i<grid.get(i).length();i++)
    	{
    		for(int j=0;j<n-1;j++)
    		{
    			//System.out.print(charr[i][j]);
    			if(charr[j][i]>charr[j+1][i] )
    				return "NO";
    		}
    		//System.out.println();
    	}   	
    	return ans;
    }
  

}

public class Grid {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<String> grid = IntStream.range(0, n).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine();
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                    .collect(toList());

                String result = Result10.gridChallenge(grid);

              System.out.println(result);
              
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

