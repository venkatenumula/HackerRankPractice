package com.dp;


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
     * Complete the 'abbreviation' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static String abbreviation(String a, String b) {
    // Write your code here
    	
    	StringBuilder au=new StringBuilder(a.toUpperCase());
    	int lastIdx=-1,currIdx=0;
    	String delStr="";
    	int start=0,end=0;
    	for(String c : b.split("") )
    	{
    		currIdx=au.indexOf(c,lastIdx+1);
    		//System.out.println(c+" CI:"+currIdx+" LI:"+lastIdx);
    		if(currIdx == -1 || currIdx < lastIdx )
    			return "NO"; 
    		
    		else if(currIdx-lastIdx >1 )
    		{
    		start=lastIdx < 0 ? 0 : lastIdx+1 ;
    		end= currIdx ==0 ? 0 : currIdx ;
    		
    		delStr+=a.substring(start,end );
    		//System.out.println(start+" "+end + " "+delStr);
    		}
    		lastIdx=currIdx;
    		//au=au.deleteCharAt(currIdx);
    	}
    	delStr+=a.substring(currIdx+1);
    	
    	System.out.println("del Strig "+delStr);
    	return delStr.toLowerCase().equals(delStr) ? "YES" : "NO" ;

    }

}

public class Abbriveation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String a = bufferedReader.readLine();

                String b = bufferedReader.readLine();

                String result = Result.abbreviation(a, b);
                System.out.println(result);

                //bufferedWriter.write(result);
              //  bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
       // bufferedWriter.close();
    }
}

