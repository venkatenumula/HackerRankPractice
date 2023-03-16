package com.searching.linear;

import java.util.Scanner;

public class MaxInequality {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int N,t;
		t=sc.nextInt();
		String s;
		
		while(t--!=0)
		{
			StringBuilder s2=new StringBuilder();
			StringBuilder s1=new StringBuilder();
			int c1=0,c2=0;
			N=sc.nextInt();
			s=sc.next();
			for(int i=0;i<N;i++)
			{
				char c=s.charAt(i);
				if(i==0)
				{
				 //System.out.println("inserting "+c+" into S1 :"+s1.toString());
				 s1.append(c);
				 c1++;
				}
				else
				{
					if(c!=s1.charAt(c1-1))
					{
						//System.out.println("inserting "+c+" into S1 :"+s1.toString());
						s1.append(c);
						 c1++;
					}
					else 
					{
						if(c2==0)
						{
							//System.out.println("inserting "+c+" into S2 :"+s2.toString());
								s2.append(c);
								c2++;
							
						}
						else if(c!=s2.charAt(c2-1))
						{
						//System.out.println("inserting "+c+" into S2 :"+s2.toString());
						s2.append(c);
						c2++;
						}
					}
				}
				
			}
			System.out.println("S1 = "+s1.toString());
			System.out.println("S2 = "+s2.toString());
			//System.out.println(s1.length()+s2.length()-2);
			System.out.println(c1-1 + (c2!=0?(c2-1):0));
			
		}
	}
}
