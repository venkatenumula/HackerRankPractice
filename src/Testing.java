import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class Testing extends Thread  {

	public static void main(String arg[]) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		//doPrint(null);
		SingleTest st = SingleTest.getInst();
		SingleTest st1 = SingleTest.getInst();
		SingleTest st2 = null;
		
		/*
		 * Constructor cons=SingleTest.class.getDeclaredConstructor();
		 * cons.setAccessible(true); st2=(SingleTest) cons.newInstance(null);
		 */		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.txt"));
		
		Testing t=new Testing();
		t.start();
		
		
		out.writeObject(st);
						
		st.doSomething();
		st1.doSomething();
		//System.out.println(st.hashCode() +"="+ st2.hashCode());
		HashMap<Integer, Integer> i=new HashMap<>();
		
		List<Integer> hs=Arrays.asList(2,-1,3,-4,2,-7);
		int x=2233;
		maxSubSum(hs);
		
		List<Integer> arrlst=new ArrayList<Integer>();
		arrlst.add(12);
		arrlst.add(10);
		arrlst.add(8);
		arrlst.add(5);
		arrlst.add(5);

		Collections.sort(arrlst);

		int xx=arrlst.get(0);
		
		System.out.println("before "+arrlst);
		
		arrlst=arrlst.stream().map(e -> e=e+1 ).collect(Collectors.toList()) ;
		System.out.println("After "+arrlst);

		System.out.println("2nd element : "+arrlst.stream().filter(e-> e > xx).findFirst());
		
		//System.out.println("searching element "+x + " "+search(hs, x) +" = "+ Collections.binarySearch(hs, x));		
		final StringBuffer fx=new StringBuffer("Hello");
		
		fx.append("/n bhai");
				
		String xa="";
		
	}
	

	
	public static int maxSubSum(List<Integer> lt)
	{
		//List<Integer> lt=new ArrayList<Integer>(set);
		
		int max=lt.get(0),sum=0;
		
		for(int x : lt )
		{
			sum+=x;
			
			if(max < sum)
				max=sum;
			if(sum < 0)
				sum=0;
			
		}
		
		
		System.out.println("max sum:"+max);
		return max;
		
	}
	
	public static void doPrint(Object s)
	{
		System.out.println("Object method");
		
	}
	
	public static void doPrint(String s)
	{
		Random r=new Random();				
		System.out.println("String method "+r.nextInt(99) );
		
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
    	//System.out.println("BS :"+mid);
    	return mid;
    }
	
	public class Testing2 extends Testing
	{
		public static void main(String arg[]) 
		{
			System.out.println("Main method in testing2");
			
			Testing t2=new Testing();
			
		}
	}

}
