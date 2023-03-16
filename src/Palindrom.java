import java.util.Scanner;

public class Palindrom {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int n=s.length()-1;
		String an="YES";
		for(int i=0;i<n;i++)
		{
			System.out.print(s.charAt(i)+" "+s.charAt(n-i));
		 if(s.charAt(i)!=s.charAt(n-i))
		 {
			 an="NO";
			 break;
		 }
			
		}
		System.out.println(an);
	}

}
