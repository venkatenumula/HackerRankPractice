package com.searching.linear;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class EasySumSet {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		Set<Integer> A=new HashSet<Integer>();
		Set<Integer> B=new HashSet<Integer>();
		Set<Integer> C=new HashSet<Integer>();
		int c1,c2,c;
		c1=sc.nextInt();
		for(int i=0;i<c1;i++)
			A.add(sc.nextInt());
		
		c2=sc.nextInt();
		for(int i=0;i<c2;i++)
			C.add(sc.nextInt());
		
		//System.out.println(findLowe(A, C)+" to "+findHigher(A, C) );
		c1=findLowe(A, C);
		c2=findHigher(A, C);
		
		for(int i=c1;i<=c2;i++)
		{
			c=0;
			for(int x : A)
			{
				
				if (C.contains((x+i)))
				{
					//System.out.println(i+" looks good");
					c++;
				}
			}
			if(c==A.size() )
				B.add(i);
			
		}
		TreeSet<Integer> ts=new TreeSet<Integer>(B);
		
		for(int x : ts )
		{
			System.out.print(" "+x);
		}
		
	}
	
	static int findLowe(Set<Integer> A,Set<Integer> C)
	{
		int a=Integer.MAX_VALUE,b=Integer.MAX_VALUE;
		
		for(int x : A)
		{
			if(a>x)
				a=x;
		}
		
		for(int x : C)
		{
			if(b>x)
				b=x;
		}
		return b-a;
	}
	
	static int findHigher(Set<Integer> A,Set<Integer> C)
	{
		int a=Integer.MIN_VALUE,b=Integer.MIN_VALUE;
		
		for(int x : A)
		{
			if(a<x)
				a=x;
		}
		
		for(int x : C)
		{
			if(b<x)
				b=x;
		}
		return b-a;
	}
}
