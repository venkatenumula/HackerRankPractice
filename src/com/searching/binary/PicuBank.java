package com.searching.binary;

import java.util.Scanner;

public class PicuBank {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);

		long d,m,a,b,x,c=0;
		int t=sc.nextInt();

		while(t--!=0)
		{
			d=sc.nextLong();
			m=sc.nextLong();
			a=sc.nextLong();
			b=sc.nextLong();
			x=sc.nextLong();
		
			
		int l=0,h=Integer.MAX_VALUE,mid=0;
		long intr=0,pos=0;
		 while(l<=h)
		{
			mid=l+(h-l)/2;
			intr=getInterest(d,m,a,b,mid);
			//System.out.println(intr+" intr val of  mid "+mid);
			 
			if(intr>=x)
			{
				
				h=mid-1;
				
			}
			else if(intr<x)
				l=mid+1;
		} 

		System.out.println(mid);
		
		}
		
	}
	static long  getInterest(long d,long m,long a,long b,long mid)
	{
		long i=0;
		long x=mid/(m+1);
		i=d+(b*x)+(mid-x)*a;
		return i;
	}

}
