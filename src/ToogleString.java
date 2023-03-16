import java.util.Scanner;

public class ToogleString {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char st[]=s.toCharArray();
		
		//System.out.println(s);
		for(char c: st)
		{
			int x=c;
			//System.out.print(x+" ");
			if(x<=95)
				System.out.print(""+(char)(x+32));
			else
				System.out.print(""+(char)(x-32));			
		}
	}
}
