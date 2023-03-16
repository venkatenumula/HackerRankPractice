

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

class Result7 {

    /*
     * Complete the 'activityNotifications' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY expenditure
     *  2. INTEGER d
     */

    public static int activityNotifications(List<Integer> expenditure, int d) {
    // Write your code here
    	int notif=0;
    	float med=0f; 
    	TreeSet<Integer> subLt=new TreeSet<Integer>(expenditure.subList(0, d));
    	PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
    	
	    for(int i=d;i<expenditure.size();i++)
	    {	    	
	    	//System.out.println(d%2);
	    	if(d%2 !=0)
	    	{
	    		//System.out.println("odd list "+subLt.get( (d+1)/2-1));
	    		//med= subLt.get( (d+1)/2-1)*2 ;
	    	}
	    	else
	    	{
	    		//System.out.println("Even list "+subLt.get( (d+1)/2-1 ) + " + "+subLt.get( (d+1)/2));
	    		//med= (subLt.get( (d+1)/2-1 ) + subLt.get( (d+1)/2) );
	    	}
	    	//med=d%2 !=0 ? subLt.get( (d+1)/2) : (subLt.get( (d+1)/2) + subLt.get( (d+1)/2) )/2 ;
	    	//System.out.println(expenditure.get(i)+ " "+subLt+" med "+med);
	    	if(med <= expenditure.get(i))
	    		notif++;
	    }
	    System.out.println(notif);
    	return notif;

    }

}

public class FraudAlert {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> expenditure = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result7.activityNotifications(expenditure, d);

       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

        bufferedReader.close();
       // bufferedWriter.close();
    }
}
