import java.math.BigInteger;
import java.util.Scanner;

public class CycleShift {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n,l,m,count,c;
		String max,tmp;
		n=sc.nextInt();
		String s;
		for(int i=0;i<n;i++)
		{	
			max="";
			count=0;c=0;
			l=sc.nextInt();
			m=sc.nextInt();
			s=sc.next();
			for(int k=0;k<m;k++)
			{
			for(int j=0;j<l;j++)
			{
				s=s.substring(1,l)+s.charAt(0);
				if(s.compareTo(max)>0)
				{
					max=s;
					c=j+1;
				}			 
			}
			count=count+c;
			}
			System.out.println(count);
		}
	}

}
