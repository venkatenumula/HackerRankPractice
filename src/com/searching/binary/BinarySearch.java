package com.searching.binary;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]= {1,5,8,9,13,17,22,55};
		System.out.println("Enter numberto search ");
		int mid=0,ele=sc.nextInt();		
		int l=0,h=a.length-1;
		/*
		 * while(l<=h) { mid=(l+h)/2; if(a[mid]==ele) {
		 * System.out.println(" Found element "+ele+" at "+mid); break; } else
		 * if(a[mid]>ele) h=mid-1; else if(a[mid]<ele) l=mid+1; else
		 * System.out.println("Element "+ele+" Not found ");
		 * 
		 * }
		 */
		
		while(l<=h)
		{
			mid=(l+h)/2;
			System.out.println(a[mid]+" Searching at index :"+mid);
			if( ele > a[h]  )
			{
				mid=h;
				break;
			}
			else if( ele < a[l]  )
			{
				mid=l;
				break;
			}
			else if(a[mid] <= ele   && a[mid+1] > ele)
			{
				break;
			}
			else if(a[mid]>ele)
				h=mid-1;
			else if(a[mid]<ele)
				l=mid+1;
			
		}
		
		System.out.println(ele+" element near index :" +mid );
		
	}

}
