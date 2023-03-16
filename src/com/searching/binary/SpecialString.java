package com.searching.binary;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;


public class SpecialString {
    public static void main(String[] args) throws IOException {
    	
    	Scanner sc=new Scanner(System.in);
    	int n=sc.nextInt();
    	String main=sc.next();
    	String spl="";
    	Map<Character, Integer> mp=new HashMap<Character, Integer>();
    	
    	for(int i=0;i<main.length();i++)
    	{
    		char c=main.charAt(i);
    		mp.put(c, (mp.get(c) ==null ? 1: mp.get(c)+1 ) );
    	}

    	 mp = mp.entrySet()
    			  .stream()
    			  .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
    			  .collect(Collectors.toMap(
    			    Map.Entry::getKey, 
    			    Map.Entry::getValue, 
    			    (oldValue, newValue) -> newValue, LinkedHashMap::new));
    	//mp.forEach((k,v)-> System.out.println(k+" "+v) );
    	while(n>0)
    	{
    		//System.out.println(spl+" is spl ,n value "+n);
    		for(Character c : mp.keySet() )
    		{
    			spl+=c;
    			n--;
    			if(n<=0)
    				break;
    		}
    	}
    	int cnt=0;
		Map<Character, Integer> res=new HashMap<Character, Integer>();
    	do
        {
    		System.out.println(cnt+" spl sting : "+spl);
    		for(int i=0;i<spl.length();i++)
        	{
        		char c=spl.charAt(i);
        		res.put(c, (res.get(c) ==null ? 1: res.get(c)+1 ) );
        	}
    		spl+=spl;
    		cnt++;
        	
        }while(!compare(mp,res));
    	System.out.println(cnt);
    	
    }
    
    static boolean compare(Map<Character, Integer> org,Map<Character, Integer> spl)
    {
    	boolean res=true;
    	
    	for(Character c : org.keySet() )
		{
			if(!(spl.get(c) >= org.get(c) ))
			{
				res=false;
				break;
			}
		}
    	
    	return res;
    }

}
