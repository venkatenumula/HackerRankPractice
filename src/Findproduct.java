import java.util.Scanner;

public class Findproduct {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int N,a=1;
		N=sc.nextInt();
		long po=(long) (Math.pow(10, 9) +7);
		for(int i=0;i<N;i++)
		{
			int x=sc.nextInt();
			a= (int) ((a*x)%po);
			//System.out.print(" "+a);
		}
		System.out.println(a);
		
	}

}
