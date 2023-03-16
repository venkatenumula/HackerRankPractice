package com.searching.binary;

import java.util.Arrays;
import java.util.Scanner;

public class HighestAverage {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(),t;

		int a[]=new int[N];
		int avg[]=new int[N];
		long sum1=0;
		int l=0,h=1;		
		for(int i=0;i<N;i++)
		{
			a[i]=sc.nextInt();
			if(i==0)
				avg[i]=a[i];
			else
			{
			//System.out.println(" avg "+(i-1)+" ="+avg[i-1] );
			avg[i]=(avg[i-1]+a[i])/(i);
			}
		}	
		Arrays.sort(a);
		Arrays.sort(avg);
		t=sc.nextInt();
		while(t--!=0)
		{
			int cnt=0;
			sum1=0;
			
			long lim=sc.nextInt();
			
			while(cnt<N)
			{
				//System.out.println(lim+" "+sum1+" "+cnt);
				System.out.println("Avg of "+cnt+" ele "+avg[cnt]);
				sum1=avg[cnt];
				if(sum1<lim)
				{
					cnt++;
					continue;
				}
				else
					break;
			}
			
			System.out.println(cnt);

		}
	}
	
	static long getAvg(int[] a,int l,int r)
	{
		long sum=0,n=0;

		while(l<=r)
		{
			
		}
		
		return sum/n;
	}

}
