
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SpecialString {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
    
    	long cnt=s.length();
    for(int i=1;i<s.length();i++)
    {
    	for(int j=0;(j+i)<s.length();j++ )
    	{
    		String x=s.substring(j,j+i+1);
    		System.out.print(i+1+" : "+x+",");
    		if((i+1) % 2 == 0 )
    		{
    			if(x.chars().distinct().count() ==1)
    				cnt++;
    		}
    		else
    		{
    			if( (x.chars().distinct().count() ==2 && (x.charAt(0)!= x.charAt(x.length()/2) ))
    				|| x.chars().distinct().count() ==1	)
    				cnt++;
    			
    		}
    	}
    	System.out.println();
    }
    System.out.println(cnt);
     return cnt;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);

       // bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
