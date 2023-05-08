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

class Result1B {

    /*
     * Complete the 'whatFlavors' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY cost
     *  2. INTEGER money
     */

    public static void whatFlavors(List<Integer> cost, int money) {
    // Write your code here
    	int idx1=0,idx2=0;
    	for(int i=0;i<cost.size();i++ )
    	{
    		idx1=i;
    		int x=cost.get(i);   		
    		idx2=cost.indexOf(money-x);
    		System.out.println(x+" at "+(idx1+1)+ " & "+(money-x)+" at "+idx2);
    		if(idx2 != -1)
    		{
    			if(idx2==idx1)
    			{
    				//System.out.println("found same positions & updating list");
    				cost.set(idx1, 0);
    				idx2=cost.indexOf(money-x);
    				if(idx2 != -1)
    	    		{
    					break;
    					
    	    		}
    				cost.set(idx1, x);
    			}
    			break;
    		}
    		
    			
    	  	
    	}
    	System.out.println(idx1+1+" "+(idx2+1));	
    }

}

public class IceCreamParlour {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int money = Integer.parseInt(bufferedReader.readLine().trim());

                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> cost = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                Result1B.whatFlavors(cost, money);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}

