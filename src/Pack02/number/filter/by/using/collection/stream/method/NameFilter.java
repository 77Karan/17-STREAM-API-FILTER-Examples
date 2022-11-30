package Pack02.number.filter.by.using.collection.stream.method;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class NameFilter 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();
		list.add("Virah Kholi");
		list.add("Ashish Nehera");
		list.add("Sourav Ganguly");
		list.add("Abhinav Mukund");
		
		Stream<String> stream = list.stream();
		
		//Method reference approach
		/*
		 * stream.filter((s) -> s.startsWith("a")) .forEach(System.out::println);
		 */
		
		
		//Lambda approach
		stream.filter((s) -> s.startsWith("A"))
		.forEach((n) -> System.out.println(n));
	}

}
