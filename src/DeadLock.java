import java.lang.reflect.Executable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Dead extends Thread
{
	static int res=0;
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+ " Thread is running ");
		
		if(Thread.currentThread().getName().equals("Thread-0"))
		{
			System.out.println("Thread-0 reached rs=5");
			this.res=5;
		}
		
		if(Thread.currentThread().getName().equals("Thread-1") && this.res==5)
		{
			System.out.println("Thread-1 reached rs=10");
			try {
				Thread.sleep(5000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.res=10;
		}
		
		do
		{
			System.out.println(Thread.currentThread().getName()+" checking value of res "+this.res);
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} while(this.res != 10);
	}
}

public class DeadLock {
	public static void main(String arg[])
	{
		Dead d1=new Dead();
		Dead d2=new Dead();
		
		
		d1.start();
		d2.start();
		
		//ExecutorService es=Executors.newFixedThreadPool(4);
		
		//es.submit(new Dead());
		
		
		System.out.println(Thread.activeCount()+" threads are running ");
	}

}
