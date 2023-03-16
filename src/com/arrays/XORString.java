package com.arrays;

import java.util.Scanner;

public class XORString {
	
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();		
		
		for(int i=0;i<s1.length();i++) 
		{
			if(s1.charAt(i)==s2.charAt(i))
				System.out.print("0");
			else
				System.out.print("1");
		}
		
	}

}
