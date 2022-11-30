package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSetStream {
		public static void main(String[] args)
		{

			// Creating a list of strings
			List<String> aList = Arrays.asList("Geeks", "for",
						"GeeksQuiz", "GeeksforGeeks", "GFG");

			// Converting to set using stream
			Set<String> set = aList.stream().collect(Collectors.toSet());

			for (String x : set)
				System.out.println(x);
		}
	}


