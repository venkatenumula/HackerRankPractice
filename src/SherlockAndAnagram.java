
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

class Result5 {

    /*
     * Complete the 'sherlockAndAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int sherlockAndAnagrams(String s) {
    // Write your code here
      int ans=0;
      for(int i=1;i<=s.length();i++ )
      {
    	  
    	  for(int j=0;j<s.length();j++)
    	  {
    		  int start=j;
    		  int end=(j+i)>s.length()?s.length():(j+i);
    		  String sub= s.substring(start, end);
    		  System.out.print(" "+sub);
    	  }
    	  System.out.println();
      }
    	
      return ans;
    }

}

public class SherlockAndAnagram {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result5.sherlockAndAnagrams(s);

               // bufferedWriter.write(String.valueOf(result));
              //  bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
       // bufferedWriter.close();
    }
}
