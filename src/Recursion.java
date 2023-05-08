
public class Recursion {
	
	public static void main(String ar[])
	{
		
		febinocii(0,1,18);
		//febnoci(10);
		
	}

	static int febinocii(int a,int b,int u)
	{
		int c=a+b;
		if( c > u)
			return c;
		
		System.out.print(" "+c);
		return febinocii(b, c, u);
	}
	
	public static int febnoci(int n)
	{

	  if( n <=0)
	    return 0;

	   System.out.print("  "+n);
	   return febnoci(n-1) + febnoci (n-2);   
	  
	}
	
}
