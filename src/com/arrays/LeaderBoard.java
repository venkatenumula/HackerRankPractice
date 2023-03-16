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

class Result7 {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

	public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
    	List<Integer> ranked2=ranked.stream().distinct().collect(Collectors.toList()) ;
    	List<Integer> ans=new ArrayList<>();
    	Collections.sort(ranked2,Collections.reverseOrder() );
    	ranked2.forEach(r->System.out.print(" "+r));
    	
    	Optional<Integer> oi=player.stream().findAny();
    	
    	for(int r : player)
    	{
    		int rank=Math.abs( Collections.binarySearch(ranked2, r));
    		System.out.println(rank+" "+r);
    		//if(rank<0)
    			//ranked2.add(rank,r);
  
    			ans.add(rank+1);
    		
    		/*
    		if(ranked2.indexOf(r)==-1)
    		{
    		ranked2.add(r);
    		Collections.sort(ranked2);
    		ans.add(ranked2.size() - ranked2.indexOf(r));    		
    		ranked2.remove(ranked2.indexOf(r));
    		}
    		else
    		{
    		Collections.sort(ranked2);
    		ans.add(ranked2.size() - ranked2.indexOf(r));
    		}
    		 */
    		
    	}
    	System.out.println();
    	ans.forEach(a->System.out.print(" "+a));
    	

    	return ans;
        }
	
	public static int superDigit(String n, int k)  {
	    // Write your code here
	    int ans=0;
	    for(int i=0;i<k;i++)
	    {
	        ans+=Integer.parseInt(""+n.charAt(i));
	    }
	    System.out.println("ans "+ans);
	    n=""+ans;
	    if(ans>10)
	    	superDigit(n,n.length());
	    
	    return ans;

	    }

}

public class LeaderBoard {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result7.climbingLeaderboard(ranked, player);


        bufferedReader.close();
    }
}
