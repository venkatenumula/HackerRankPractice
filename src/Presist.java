import java.util.Collections;
import java.util.List;

import javax.sql.DataSource;

public class Presist {
	
	public static void main(String[] args)
	{
	int dayOfWeek = 4;

	String day;

	switch (dayOfWeek) {

	case 1: day = "Monday";

	break;

	case 2: day = "Tuesday";

	break;

	case 3: day = "Wednesday";

	break;

	 default:

	day = "Unknown";

	}

	System.out.println(day);
	
	List<Integer> list= List.of(4, 5, 7, 11, 9, 13, 8, 12);
	

	int target=20;

	for( int i=0 ;i < list.size();i++ )
	{
	   int x=list.get(i);	
	   int y=target-x;
	   int i1=list.indexOf(y);
	   if( i1 != 0 && i1 != -1 && i1 > i )
	   {
	   System.out.println("["+x+","+y+"]");
	  //list.remove(x);
	   }
	  
	}
	
	
	

	}

}
