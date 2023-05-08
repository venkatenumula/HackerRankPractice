import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.event.ListSelectionEvent;


public class Test {

	public static void main(String ar[]) throws Exception
	{
		System.out.println("Active threads "+Thread.activeCount() );
		System.out.println("Active threads app wise "+ManagementFactory.getThreadMXBean().getThreadCount() );
		System.out.println("All threads "+Thread.getAllStackTraces().keySet().size()  );
		
		String s="Hello andi. \n naa peru venkat. \n\n keep f**ing. Bye";
		
		System.out.println("lines count :"+s.lines().count());
		List<Integer> inLst=new ArrayList<Integer>();
		inLst.add(10);
		inLst.add(50);
		inLst.add(323230);
		//System.out.println( Collections.max(inLst));
		
		//System.out.println(inLst.stream().mapToInt(Integer :: intValue).max() );
		inLst.add(1);
		//System.out.println("size :"+inLst.size());
		/*
		 * for(int x: inLst ) { if(x>1000) inLst.add(1001);
		 * 
		 * }
		 */
		//System.out.println("size :"+inLst.size());
		System.out.println(inLst.stream().filter(e->e%2==0).collect(Collectors.toList()));
		stringPermute("ABC");
		System.out.println("e*3 : "+inLst.stream().filter(e->e%2==0).map(e->e*3).collect(Collectors.toList()));
		Stream<Integer> st=inLst.stream();
		
		//a();
	}
	
	@CustomAnnotation(age = 28)
	static void stringPermute(String input)
	{
		Set<String> ss=new HashSet<String>();
		String x=input;
		for(int i=0;i<x.length(); i++)
		{
		  String y=""+x.charAt(i);
		  
		  String head=x.substring(0,i)+x.substring(i+1);
		  System.out.println("i:"+i+" j:"+0+" y:"+y+" head:"+head); 
		  
		  for(int j=0;j<x.length(); j++)
		{
			  StringBuffer sb=new StringBuffer(head);
			  sb.insert(j,y);
			 // System.out.println(sb.toString());
			  ss.add(sb.toString());
		  // String out=x.substring(0,j)+y+x.substring(j);
		   //System.out.println("O: "+out);
		   
		  }
		}
		System.out.println(ss);
	}
	
	static void a() throws Exception {
		int a =5;
		try {
		a =10;
		throw new ArrayIndexOutOfBoundsException();
		}
		catch(ArrayIndexOutOfBoundsException e) {
		a= 14;
		}		
		 System.out.println(a);
		 
		 Map<Integer,String> hm=new ConcurrentHashMap<Integer, String>();
		 
		 hm.put(1, "VENKAT");
		 hm.put(2, "Bindu");
		 
		 System.out.println(hm);
		 
		 Comparator<String> cm= new Comparator<String> () {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}};	 
			
			hm.keySet().stream().collect(Collectors.toList());
			//Collections.sort(hm,cm);
			
		 //hm=Collections.unmodifiableMap(hm);
		 
		// hm.put(3, "Boiii");
		 List<String> l=Arrays.asList("A","B");
		 
		 int[] arr = {5, -2,23,7,87, -42,509};
		 List<Integer> ll=Arrays.stream(arr).boxed().collect(Collectors.toList());
		 
		 System.out.println(ll);
		 
		// l.add("OH");
		 String av= "AAA";

				 Map<String,Integer> m=new HashMap<String,Integer>();

				 for(String s: av.split(""))
				 {
				   m.put(s, m.getOrDefault(s,0)+1);
				 }
				 System.out.println(m);
		}
}
