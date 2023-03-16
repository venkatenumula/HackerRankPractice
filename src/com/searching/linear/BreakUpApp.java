package com.searching.linear;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class BreakUpApp {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int N=0,t,w,max=0,cnt=0;
		String mDate="";
		t=sc.nextInt();
		sc.nextLine();
		String msg;
		//System.out.println(msg.matches("[1-9]{2}"));
		//float r;
		Map<String, Integer> m=new HashMap<String, Integer>();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<t;i++)
		{
			w=1;
			msg=sc.nextLine();
			//System.out.println(i+" msg :"+msg);
			if(msg.startsWith("G:"))
				w=2;
			
			String[] ms=msg.split(" ");
			for(String s: ms)
			{
				//System.out.println(s+" matches ? "+s.matches("[1-9]{2}") );
				if(s.matches("[0-9]{1,2}"))
				 {
					m.get(s);
					//System.out.println(s+" "+w);
					m.put(s, (m.get(s) ==null ? w: m.get(s)+w ) );
				 }
			}
		}
		if(m.size()!=0 )
		{
		max=Collections.max(m.entrySet(), Map.Entry.comparingByValue()).getValue().intValue() ;
		mDate=Collections.max(m.entrySet(), Map.Entry.comparingByValue()).getKey();
		}
		
		for(int x : m.values() )
		{
			if(x==max)
				cnt++;
		}
		//m.forEach((k,v)-> System.out.println(k+"-"+v));
		System.out.println("Max "+max+" "+cnt+" "+mDate);

		if(cnt==1 && (mDate.equals("19") || mDate.equals("20") ))
			System.out.println("Date");
		else
			System.out.println("No Date");
		m.clear();
	}
	public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
	    // Write your code here
	     List<Integer> ans=new ArrayList<>();
	     
	     for(String str : queries)
	     {
	    	int x=(int) strings.stream().filter(e -> e.equals(str) ).count();
	         ans.add((int)strings.stream().filter(e -> e.equals(str) ).count());
	         
	     }
	     
	     return ans;

	    }

}
