import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Test {

	public static void main(String ar[])
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
		//System.out.println(inLst.stream().filter(e->e%2==0).collect(Collectors.toList()));
		stringPermute("ABC");
	}
	
	static void stringPermute(String input)
	{
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
			  System.out.println(sb.toString());
		  // String out=x.substring(0,j)+y+x.substring(j);
		   //System.out.println("O: "+out);
		   
		  }
		}
	}
}
