
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

class Result9 {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
    // Write your code here
    	
    HashMap<Character, Integer> cm=new HashMap<Character, Integer>();
    
    for(Character c : s.toCharArray() )
    {
    	cm.put(c, cm.getOrDefault(c, 0)+1);
    }
    System.out.println(cm);
    
    long cnt=cm.values().stream().distinct().count();
    if(cnt >2)
    	return "NO";
    else if(cnt ==2)
    {
    	if(Collections.max(cm.values()) - Collections.min(cm.values()) !=1 )
    		return "NO";
    }     
     
     return "YES";
    }
    
    public static String isValid1(String s)
    {
    	List<String> dis=s.chars().distinct().mapToObj(c-> Character.toString((char)c) ).collect(Collectors.toList());
        String out="NO";
        int noOfTwo=0;
        for(String c : dis)
        {
       	 
       	 long cnt=s.codePoints().filter( ss-> ss==c.charAt(0)).count();
       	 System.out.println(c +" " +cnt);
       	 if(cnt==2 )
       		 noOfTwo++;
       	 
       	 else if(noOfTwo >1 || cnt >2)
       	 {
       		 //System.out.println("NO");
       		 return "NO";
       	 }
        }

        
        return "YES";
    }
    

}

public class SherlockString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result9.isValid(s);
        System.out.println(result);

      //  bufferedWriter.write(result);
       // bufferedWriter.newLine();

        bufferedReader.close();
       // bufferedWriter.close();
    }
}
