package com.searching.binary;

import java.util.Arrays;
import java.util.Scanner;

public class Coins {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int a[]=new int[N];
		long sum1=0,sum2=0;
		int l=0,h=N-1,mid;
		
		for(int i=0;i<N;i++)
		{
			a[i]=sc.nextInt();
		}	
		Arrays.sort(a);
		String out="NO";
		while(l<=h)
		{
			mid=(l+h)/2;
			sum1=getSum(a,0,mid,a[mid]);
			sum2=getSum(a,mid+1,N-1,a[mid]) ;
			if(sum1 == sum2)
			{
				out="YES";
				break;
			}
			else if(sum1 > sum2)
				h=mid-1;
			else if(sum1 < sum2)
				l=mid+1;

		}
		System.out.println(out);
			
	}
	
	static long getSum(int[] a,int l,int u,long x)
	{
		long sum=0;
		
		for(int i=l; i<=u; i++)
		{
			if(a[i]!=x)
				sum+=a[i];
		}
		//System.out.println("Sum of "+l+" .. "+u+" is :"+sum );
		
		return sum;
	}

}
