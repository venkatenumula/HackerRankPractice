import java.io.Serializable;

public class SingleTest implements Serializable{
	
	public static SingleTest INSTANCE=null;
	private SingleTest() {}
	
	public static SingleTest getInst()
	{
		if(INSTANCE ==null)
		{
			System.out.println("Creating instance for 1st time");
			INSTANCE=new SingleTest();
		}
		return INSTANCE;
	}
	
	public void doSomething()
	{
		System.out.println("doSomething from "+ Thread.currentThread().getName());
	}
	

}
