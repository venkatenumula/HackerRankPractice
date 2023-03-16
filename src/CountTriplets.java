
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

public class CountTriplets {

    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
    	Map<Long,Long> cm=new HashMap<Long, Long>();
    	
    	for(long l:arr)
    	{
    		if(cm.get(l)!=null)
    			cm.put(l, cm.get(l)+1);
    		else
    			cm.put(l, 1L);
    	}
    	BigInteger c=new BigInteger("0");
    	
    	Long cnt=0L;
    	for(Map.Entry<Long, Long> x : cm.entrySet() )
    	{
    		long ele=x.getKey();
    		if(cm.containsKey(ele*r) && cm.containsKey(ele*r*r) ) 
    		{
    			System.out.println(ele+" triplets "+(ele*r)+" & "+(ele*r*r)+" present in map "+cm);
    			cnt=cnt+(long) (cm.get(ele)*cm.get(ele*r)*cm.get(ele*r*r));
    			//c=BigInteger.valueOf(cnt);
    		}
    	}
    	/*for(int i=0;i<arr.size();i++)
    	{
    		long ele=arr.get(i);
    		
    		if(arr.contains(ele*r) && arr.contains(ele*r*r) )
    		{
    			System.out.println(ele+" triplets "+(ele*r)+" & "+(ele*r*r)+" present in list "+arr+" time "+cm.get(ele));
    			cnt+=cm.get(ele);
    		}
    	} */
    	System.out.println(cnt);
        return c.longValue();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(toList());

        long ans = countTriplets(arr, r);

        //bufferedWriter.write(String.valueOf(ans));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}
