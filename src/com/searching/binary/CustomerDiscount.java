package com.searching.binary;

import java.io.*;
import java.util.*;

public class CustomerDiscount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        TreeMap<Character,Integer> mp=new  TreeMap<Character, Integer>();
        int M = Integer.parseInt(line[1]);
	int d = Integer.parseInt(line[2]);
         String[] arr_arr = br.readLine().split(" ");
         int[] arr = new int[N];
         for(int i_arr = 0; i_arr < arr_arr.length; i_arr++)
         {
         	arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
         }
         String[] arr_cost = br.readLine().split(" ");
         int[] cost = new int[M];
         for(int i_cost = 0; i_cost < arr_cost.length; i_cost++)
         {
         	cost[i_cost] = Integer.parseInt(arr_cost[i_cost]);
         }

         int[] out_ = maxCustomers(N, M, d, arr, cost);
         System.out.print(out_[0]);
         for(int i_out_ = 1; i_out_ < out_.length; i_out_++)
         {
         	System.out.print(" " + out_[i_out_]);
         }
         

         wr.close();
         br.close();
    }
    static int[] maxCustomers(int N, int M, int d, int[] arr, int[] cost){
       // Write your code here
        int[] result = {0};

        return result;
    
    }
}