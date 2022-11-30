package Pack01.number.filter.by.using.OF.METHOD;

import java.util.stream.Stream;

public class NumberFilter 
{
	public static void main(String[] args) 
	{
		Stream<Integer> stream = Stream.of(12,34,64,12,421,53,13,98,44);
		
		//Step by Step Approach
		/*
		 * Stream<Integer> filtredStream1 = stream.filter((i) -> i<=50);
		 * filtredStream1.forEach((i) -> System.out.println(i));
		 */
		
		//Single Line approach using Lambda
		/*
		 * stream.filter((i) -> i<=50) .forEach((i) -> System.out.println(i));
		 */
		
		
		//Single line approach using method reference
		stream.filter((i) -> i<=50)
		.forEach(System.out::println);
	}

}
