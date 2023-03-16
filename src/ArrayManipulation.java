

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

class Result3 {

    /*
     * Complete the 'arrayManipulation' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

	public static long arrayManipulation1(int n, List<List<Integer>> queries) {
        long[] aux = new long[n];
        for(int i = 0; i < queries.size(); i++){
        	
            aux[queries.get(i).get(0) - 1] += queries.get(i).get(2);
            if(queries.get(i).get(1) < n){
                aux[queries.get(i).get(1)] -= queries.get(i).get(2);
            }
            for(int j=0;j<n;j++)
        	{
        		System.out.print(" "+aux[j]);
        	}
            System.out.println();
        }
        long max = Integer.MIN_VALUE;
        long current = 0;
        
        for(int i = 0; i < aux.length; i++){
            current += aux[i];
            if(current > max){
                max = current;
            }
        }
        System.out.println(max);
        return max;
     }
	
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
    // Write your code here
    	
    	long lt[]=new long[n+1];
    	
    	for(List<Integer> inner : queries )
    	{
    		for(int i=inner.get(0);i<=inner.get(1);i++ )
    		{ 
    			//System.out.println("i="+i+" ele="+lt.get(i-1)); 
    			lt[i-1]+=inner.get(2);
    		}
    		
    	}
    	/*List<Long> lt = LongStream.of(new long[60])
                .boxed()
                .collect(Collectors.toList());
    	
    	for(List<Integer> inner : queries )
    	{
    		//System.out.println("iiner ="+lt);
    		for(int i=inner.get(0);i<=inner.get(1);i++ )
    		{ 
    			//System.out.println("i="+i+" ele="+lt.get(i-1)); 
    			lt.set(i-1, lt.get(i-1)+inner.get(2));
    		}
    	} */
    	
    	long x=Long.MIN_VALUE;
    	for(int i=0;i<lt.length;i++)
    	{
    		if(lt[i]>x)
    			x=lt[i];
    	}
    	System.out.println(x);
    	return x;

    }

}

public class ArrayManipulation {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, m).forEach(i -> {
            try {
                queries.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        long result = Result3.arrayManipulation1(n, queries);

       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
