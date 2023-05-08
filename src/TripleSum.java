

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;


public class TripleSum {

    // Complete the triplets function below.
    static long triplets(int[] a, int[] b, int[] c) {
     long ans=0L;
         
     Set<Integer> bs=Arrays.stream(b).boxed().sorted().collect(Collectors.toSet());    		 
 
     List<Integer> la=Arrays.stream(a).boxed().distinct().sorted().collect(Collectors.toList());
     List<Integer> lc=Arrays.stream(c).boxed().distinct().sorted().collect(Collectors.toList());
     
    System.out.println(la );
     for(int x:bs )
     {
    	 long al=0,cl=0;
    	//  al=as.parallelStream().filter(ae-> ae <= x ).count();
    	//  cl=cs.parallelStream().filter(ce-> ce <= x ).count();
    	/* 
    	 for(int y : as) 
    	 {
    		 if(y > x )
    			 break;
    		 al++;
    	  }
    	 //System.out.println(x+" "+al+" "+as);
    	 for(int y : cs) 
    	 {
    		 if(y > x )
    			 break;
    		 cl++;
    	  }  */
    	 //System.out.println(x+" "+cl+" "+cs);
       	 al=search(la, x);
    	 cl=search(lc, x);
    	 ans+=al*cl;
    	 //System.out.println(": "+x+" "+ans);
     }
     
     System.out.println(ans);
     return ans;
     
    }
    
    static int search(List<Integer> lt,int e)
    {    	
        	
    	int left=0;
    	int right= lt.size()-1;
    	int mid=(left+right)/2;
    	
    	while(left <= right)
    	{
    		if(lt.get(mid)==e)
    			break;
    		else if(lt.get(mid) < e)
    		{
    			left=mid+1;
    		}
    		else
    		{
    			right=mid-1;
    		}
    		
    		mid=(left+right)/2;
    	}
    	System.out.println("BS :"+mid);
    	return mid;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] lenaLenbLenc = scanner.nextLine().split(" ");

        int lena = Integer.parseInt(lenaLenbLenc[0]);

        int lenb = Integer.parseInt(lenaLenbLenc[1]);

        int lenc = Integer.parseInt(lenaLenbLenc[2]);

        int[] arra = new int[lena];

        String[] arraItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < lena; i++) {
            int arraItem = Integer.parseInt(arraItems[i]);
            arra[i] = arraItem;
        }

        int[] arrb = new int[lenb];

        String[] arrbItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < lenb; i++) {
            int arrbItem = Integer.parseInt(arrbItems[i]);
            arrb[i] = arrbItem;
        }

        int[] arrc = new int[lenc];

        String[] arrcItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < lenc; i++) {
            int arrcItem = Integer.parseInt(arrcItems[i]);
            arrc[i] = arrcItem;
        }

        long ans = triplets(arra, arrb, arrc);

      //  bufferedWriter.write(String.valueOf(ans));
       // bufferedWriter.newLine();

       // bufferedWriter.close();

        scanner.close();
    }
}
