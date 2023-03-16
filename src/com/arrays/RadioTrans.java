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

class Result12 {

    /*
     * Complete the 'hackerlandRadioTransmitters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY x
     *  2. INTEGER k
     */

    public static int hackerlandRadioTransmitters(List<Integer> x, int k) {
    // Write your code here
    	int c=0,pos=x.get(0),s=0;
    	Collections.sort(x);
    	for(int i=0;i<x.size();i++)
    	{
    		s=x.get(i);
    		System.out.println(s+" "+(pos+k));
    		if(s>pos+k || i==0)
    		{
    		 System.out.println("Standing at "+s+" house");
    		for(pos=s+k;pos>=s;pos--)
    		{
    			if(x.contains(pos))
    			{
    				c++;
    				break;
    			}
    		}
    		System.out.println(c+" Trans at house :"+pos);
    		}    		    		
    	}  	
    	return c;
    }
    public static void noPrefix(List<String> words) {
        // Write your code here
    	int i=0;
    	for(i=0;i<words.size();i++)
    	{
    		String s=words.get(i);
    		Optional<String> match= words.subList(i+1, words.size()).stream().filter(e->e.contains(s)).findFirst() ;
    	     
    		if(match.isPresent())
    		{
    			System.out.println("BAD SET");
    			System.out.println(match.get());
    			break;
    		}
    		
    	}
    	if(i==words.size())
    		System.out.println("GOOD SET");

        }

}

public class RadioTrans {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> x = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result12.hackerlandRadioTransmitters(x, k);
        System.out.println(result);



        bufferedReader.close();
    
    }
}

