package com.searching.linear;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GoldenRectangles {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int N=0,t;
		t=sc.nextInt();
		//float r;
		Map<Integer, Integer> m=new HashMap<Integer, Integer>();
		
		while(t--!=0)
		{
			double w,h;
			w= sc.nextDouble();
			h=sc.nextDouble();
			double r =w/h;
			double r2 =h/w;
			if((r >= 1.6  && r  <= 1.7) || (r2 >= 1.6  && r2  <= 1.7) )
				N++;
		}
		System.out.println(N);
	}
}
