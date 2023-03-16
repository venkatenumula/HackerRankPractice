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

class Result6 {

    /*
     * Complete the 'bomberMan' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING_ARRAY grid
     */

    public static List<String> bomberMan(int n, List<String> grid,int r,int c) {
    // Write your code here
    	
    	char ngrid[][]=new char[r][c];
    	List<String> ans=new ArrayList<>();
    	for(int i=0;i<r;i++)
    	{
    		ngrid[i]=grid.get(i).toCharArray();
    	}
    	
    	if(n%2==0)
    	{
    		for(int i=0;i<grid.size();i++)
    			 ans.add(grid.get(i).replaceAll(".", "O"));
    		
    		return ans;
    		
    	}
    	else if(n>6)
    	n=(n+1)%4;

    	//printGrid(ngrid);
    	for(int k=1;k<n;k++)
    	{
    		if(k%2==1)
    		{
    		for(int i=0;i<ngrid.length;i++)
        	{
        		for(int j=0;j<ngrid[i].length;j++)
        		{
        			if(ngrid[i][j]=='.')
        			{
        				ngrid[i][j]='O';
        			}
        			else if(ngrid[i][j]=='O')
        			{
        				ngrid[i][j]='X';
        			}
        		}
        	}
    		}
    		else
    		{
    			for(int i=0;i<ngrid.length;i++)
            	{
            		for(int j=0;j<ngrid[i].length;j++)
            		{
            			if(ngrid[i][j]=='X')
            			{
            				int s=(j-1)<0 ? 0 : (j-1);
            				int e=(j+1)>ngrid[i].length-1 ? ngrid[i].length-1 : (j+1);
            				for(int l=s;l<=e;l++)
            				{
            					//Blasting adj rows
            				   if(ngrid[i][l]=='O' || j==l)
            					ngrid[i][l]='.';
            				}
            				if(i>0 && ngrid[i-1][j] !='X' )
            					ngrid[i-1][j]='.';
            				if(i<ngrid.length-1 && ngrid[i+1][j] !='X' )
            					ngrid[i+1][j]='.';
            			}
            		}
            	}
    			
    		}
    		
    		System.out.println("Grid after "+(k+1) +" \n ");
    		printGrid(ngrid);   		
    	}
    		
    	for(int i=0;i<ngrid.length;i++)
    		ans.add(new String(ngrid[i]).replaceAll("X", "O") );
    	
    	return ans;

    }
    static void printGrid(char[][] ngrid)
    {
    	for(int i=0;i<ngrid.length;i++)
    	{
    		for(int j=0;j<ngrid[i].length;j++)
    			System.out.print(ngrid[i][j]);
    		
    	   System.out.println();
    	}
    	
    }
    
    public static String isValid(String s) {
        // Write your code here
    	Map<Character,Integer> cm=new HashMap<>();
    	for(int i=0;i<s.length();i++)
    	{
    		Integer c=cm.get(s.charAt(i));
    		if(c==null)
    			cm.put(s.charAt(i), 1);
    		else
    			cm.put(s.charAt(i), c+1);
    					
    	}
    	cm.forEach((k,v)-> System.out.println(k+" "+v) );
    	List<Integer> ans=cm.values().stream().collect(Collectors.toList());
    	ans.stream().forEach(ss->System.out.println(ss));
    	if(ans.stream().distinct().count()==1 )
    		return "YES";
    	else 
    	{
    		List<Integer> ans1=ans.stream().distinct().collect(Collectors.toList());
    		if(ans1.stream().count()==2 &&  Math.abs (ans1.get(0)-ans1.get(1))==1 )
                return "YES";
            else    
            return "NO";
    	}

        }
    

}

public class BomberMan {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int r = Integer.parseInt(firstMultipleInput[0]);

        int c = Integer.parseInt(firstMultipleInput[1]);

        int n = Integer.parseInt(firstMultipleInput[2]);

        List<String> grid = IntStream.range(0, r).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<String> result = Result6.bomberMan(n, grid,r,c);
        result.stream().forEach(s-> System.out.println(s));

        bufferedReader.close();
       
    }
}
