import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DuplicateWords {

	public static void main(String ar[]) {
		
		String word="venkat is goodboy and venkat loves bindu . bindu is a girl :)";
		List<String> words= Arrays.asList(word.split(" "));
		for(String s : words)
		{
			if(Collections.frequency(words, s)>1)
				System.out.println(s);
		}
	}

}
