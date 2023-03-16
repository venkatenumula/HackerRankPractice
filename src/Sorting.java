
public class Sorting {

	public static void main(String ar[])
	{
		int arr[]= {10,9,2,66,71,4,52,-2};
		
		long start=System.currentTimeMillis();
         //bubbleSort(arr);
		selectionSort(arr);
         System.out.println("Time for sorting :"+( System.currentTimeMillis()-start) +" ms" );
		for(int i=0; i<arr.length;i++ )
			System.out.print(arr[i]+" ");
	}
	
	static void bubbleSort(int arr[])
	{
		for(int i=0; i<arr.length-1;i++ )
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j] > arr[j+1] )
				{
					int t=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=t;
				}
			}
		}
	}
	
	static void selectionSort(int arr[])
	{
		for(int i=0; i<arr.length-1;i++ )
		{
			int min_pos=i;
			for(int j=i+1; j<arr.length;j++ )
			{
				if(arr[min_pos] > arr[j] )
					min_pos=j;
			}
			int t=arr[min_pos];
			arr[min_pos]=arr[i];
			arr[i]=t;		
		}		
	}
	
}
