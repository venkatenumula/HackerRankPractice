import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class Testing {

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
		
		out.writeObject(st);
						
		st.doSomething();
		st1.doSomething();
		System.out.println(st.hashCode() +"="+ st2.hashCode());
		HashMap<Integer, Integer> i=new HashMap<>();
		
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

}
