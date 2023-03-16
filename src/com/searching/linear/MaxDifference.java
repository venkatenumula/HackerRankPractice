package com.searching.linear;

import java.util.Scanner;

public class MaxDifference {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		long min1=Long.MAX_VALUE ,min2=Long.MAX_VALUE,max1=Long.MIN_VALUE,max2=Long.MIN_VALUE;
		int N;
		N=sc.nextInt();
		long a[] = new long[N];
		for(int i=0;i<N;i++)
		{
			a[i]=sc.nextInt();
			if(a[i]>max1)
			{
				//System.out.println(a[i]+" > max1 : "+max1);
				max2=max1;
				max1=a[i];	
			}
			else if(a[i]>max2)
			{
				//System.out.println(a[i]+" > max2 : "+max2);
				max2=a[i];
			}
			
			 if(a[i]<min1)
			 {
				// System.out.println(a[i]+" < min1 : "+min1);
				min1=a[i];
			 }
			 if(a[i]<min2 && a[i] > min1)
			 {
				//System.out.println(a[i]+" < min2 : "+min2);
				min2=a[i];
			 }
		}
		System.out.println("max numbers : "+ max1+" , "+max2);
		System.out.println("min numbers : "+ min1+" , "+min2);
		System.out.println((max1-min1)+(max2-min2));
	}
}
