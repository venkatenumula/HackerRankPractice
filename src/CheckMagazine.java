
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result4 {

    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
    // Write your code here
    	Map<String,Integer> mmap=new HashMap<String, Integer>();
    	Map<String,Integer> nmap=new HashMap<String, Integer>();
    	for(String s:magazine)
    	{
    		if(mmap.get(s)!=null)
    			mmap.put(s, mmap.get(s)+1);
    		else
    			mmap.put(s, 1);
    		
    	}
    	
    	for(String s:note)
    	{
    		if(nmap.get(s)!=null)
    			nmap.put(s, nmap.get(s)+1);
    		else
    			nmap.put(s, 1);
    		
    	}
    	
    	System.out.println(mmap);
    	System.out.println(nmap);
    	
    	for(Entry<String, Integer> nt : nmap.entrySet() )
    	{
    		if( !mmap.containsKey(nt.getKey())  || mmap.containsKey(nt.getKey()) && mmap.get(nt.getKey()) < nt.getValue() )
    		{
    			System.out.println("No");
    			return;
    		}
    	}
    	System.out.println("Yes");
    	
    }

}

public class CheckMagazine {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        List<String> note = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        Result4.checkMagazine(magazine, note);

        bufferedReader.close();
    }
}
