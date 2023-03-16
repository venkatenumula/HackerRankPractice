

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

class Result8 {

    /*
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static int makeAnagram(String a, String b) {
    // Write your code here
    	StringBuffer sb=new StringBuffer(a);
    	
    	List<String> x=a.chars().distinct().mapToObj(e -> Character.toString((char) e)).collect(Collectors.toList()) ;
    	HashMap<String, Integer> amap=new HashMap<String, Integer>();
    	for(String s: a.split(""))
    	{
    	  amap.put(s, amap.getOrDefault(s, 0)+1 );
    	}
    	
    	HashMap<String, Integer> bmap=new HashMap<String, Integer>();
    	for(String s: b.split(""))
    	{
    	  bmap.put(s, bmap.getOrDefault(s, 0)+1 );
    	}
    	
    	System.out.println(amap+","+bmap);
    	int c=0;
    	
    	for(Map.Entry<String, Integer> e : amap.entrySet() )
    	{
    		String k=e.getKey();
    		if(!b.contains(k) )
    		{
    			a=a.replaceAll(k, "");
    			c+=e.getValue();
    			System.out.println("cnt ="+c+" deleting "+k+" times:"+e.getValue());
    		}
    		else if(b.contains(e.getKey()) && amap.get(k) != bmap.get(k) )
    		{
    			a=a.replaceAll(k, "") + k.repeat(Math.min(e.getValue() , bmap.get(k))) ;
    			c+=Math.min(e.getValue() , bmap.get(k));
    			System.out.println("cnt ="+c+" deleting "+k+" times::"+Math.abs(e.getValue() - bmap.get(k)));
    		
    			amap.put(k,Math.min(e.getValue() , bmap.get(k)));
    			}
    		System.out.println(k+" :"+c +" "+a);
    	}
    	System.out.println("---------------------");
    	System.out.println(amap+","+bmap);
    	for(Map.Entry<String, Integer> e : bmap.entrySet() )
    	{
    		String k=e.getKey();
    		if(!a.contains(k) )
    		{
    			b=b.replaceAll(k, "");
    			c+=e.getValue();
    			System.out.println("cnt ="+c+" deleting "+k+" times:"+e.getValue());
    		}
    		else if(a.contains(e.getKey()) && amap.get(k) != bmap.get(k) )
    		{
    			b=b.replaceAll(k, "") + k.repeat(Math.min(e.getValue() , amap.get(k))) ;
    			c+=Math.min(e.getValue() , amap.get(k));
    			System.out.println("cnt ="+c+" deleting "+k+" times::"+Math.abs(e.getValue() - amap.get(k)));
    			bmap.put(k,Math.min(e.getValue() , amap.get(k)));
    			}
    		System.out.println(k+" :"+c +" "+b);
    	}
    	char[] ac=a.toCharArray();
    	Arrays.sort(ac);
    	char[] bc=b.toCharArray();
    	Arrays.sort(bc);
    	System.out.println("a="+String.valueOf(ac) +" b="+String.valueOf(bc) +" count="+c);
     return c;
    }
    
    public static int makeAnagram2(String a, String b) {
    	// Write your code here


    	    int count=0;
    	    int matchingCount=0;
    	    int initialCount=b.length();


    	      for(char aChar: a.toCharArray()){

    	         if(b.indexOf(aChar)!=-1){
    	            b =b.replaceFirst(""+aChar,"");
    	            matchingCount++;
    	         }
    	         else{
    	             count++;
    	         }

    	      }
    	    count=count+ initialCount-matchingCount ;
    	    System.out.println(count+" "+b);

    	    return count;
    	}

}

public class AnagramsMaking {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = bufferedReader.readLine();

        String b = bufferedReader.readLine();

        int res = Result8.makeAnagram(a, b);

     //   bufferedWriter.write(String.valueOf(res));
     //   bufferedWriter.newLine();

        bufferedReader.close();
     //   bufferedWriter.close();
    }
}
