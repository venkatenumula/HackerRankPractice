import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
    // Write your code here
    	int bribe=0;
    	for(int i=0; i<q.size();i++)
    	{
    		if(q.get(i) >(i+1))
    		{
    			int s=q.get(i)-(i+1);
    			System.out.println("q="+q.get(i)+" i="+(i+1)+" s="+s);
    			if(s>2)
    			{
    				bribe=-1;
    			    break;
    			}
    			bribe+=(s);
    			int a=q.get(i);
    			q.set(i, a);
    		}
    	}

    	if(bribe==-1)
    	System.out.println("Too chaotic");
    	else
    		System.out.println(bribe);
    }

}

public class MinimumBribes {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> q = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                Result1.minimumBribes(q);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
