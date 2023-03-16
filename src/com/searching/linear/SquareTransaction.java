package com.searching.linear;

import java.util.Scanner;

public class SquareTransaction {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int N=0,t;
		long sum,target;
		t=sc.nextInt();
		long a[] = new long[t];
		for(int i=0;i<t;i++)
		{
			a[i]=sc.nextLong();
		}
		N=sc.nextInt();
		while(N--!=0)
		{
			target=sc.nextLong();
			sum=0;
			for(int i=0;i<t;i++)
			{
				sum+=a[i];
				//System.out.println(i+" th trans sum : "+sum+" for target "+target);
				if(sum>=target)
				{
				  System.out.println(i+1);
				  break;
				}
				else if(i==t-1 && sum<target)
					System.out.println("-1");
			}	
		}
	}

}
