package com.searching.linear;

import java.io.*;
import java.util.*;


public class PoliceThief {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String[] line = br.readLine().split(" ");
            int N = Integer.parseInt(line[0]);
            int K = Integer.parseInt(line[1]);
            char[][] A = new char[N][N];
            for(int i_A=0; i_A<N; i_A++)
            {
            	String[] arr_A = br.readLine().split(" ");
            	for(int j_A=0; j_A<arr_A.length; j_A++)
            	{
            		A[i_A][j_A] = arr_A[j_A].charAt(0);
            	}
            }

            int out_ = solution(A, K);
            System.out.println(out_);
         }

         wr.close();
         br.close();
    }
    static int solution(char[][] A, int K){
        // Write your code here
    	
    	int x=A.length;
    	int cnt=0;
    	Character c=A[0][0];
    	
    	for(int i=0;i<x;i++)
    	{
    		for(int j=0;j<x;j++)
    		{
    			if(A[i][j]=='P' || A[i][j]=='p' )
    			{
    			for(int l=(j-K ) <0 ?0:(j-K); l<( (j+K+1) > x ?x : (j+K+1));l++)
    			{
    				if(i==8)
    				{
    				//System.out.println(A[i][l]+" at "+i+l+" In Range of police "+i+j );
    				}
    				
    				if(A[i][l]=='T')
    				{
    					A[i][l]='C';
    					cnt++;
    					if(i==8)
        				{
        				//System.out.println("Police from "+i+j+" caugh T on "+i+l );
        				}
    					//System.out.print(""+i+l);
    					//System.out.print(A[i][l]+" ");
    					break;
    				}
    				
    			}
    			}
    			//System.out.print(""+A[i][j]);
    		}
    		//System.out.println();
    	}
		
		 // for(int i=0;i<x;i++) { 
			//  for(int j=0;j<x;j++) 
				//  System.out.print(A[i][j]+" ");
		 // System.out.println();}
		 
    	return cnt;
    
    }
}