import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArraySort {
	public static void main(String ar[])
	{
		int a[]= {22,7,59,-61,3,88};
		
		int mid=a.length/2;
		for(int i=0;i<mid;i++)
		{
			for(int j=i+1;j<mid;j++)
			{				
				if(a[j]<a[i] )
				{
					int tmp=a[j];
					a[j]=a[i];
					a[i]=tmp;					
				}				
			}			
		}
		
		for(int i=mid;i<a.length;i++)
		{
			for(int j=mid+1;j<a.length;j++)
			{				
				if(a[j]>a[i] )
				{
					int tmp=a[j];
					a[j]=a[i];
					a[i]=tmp;					
				}				
			}			
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		List<Integer> lt=List.of(22,7,59,-61,3,88);
		lt.subList(0, lt.size()/2);
		
		Collections.sort(lt,Collections.reverseOrder() );
		
		
	}

}
