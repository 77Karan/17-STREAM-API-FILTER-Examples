package Pack03.Person.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PersonFilter 
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("Ashok",22,"Software");
		Person p2 = new Person("Bhanu",28,"Farmer");
		Person p3 = new Person("Chandu",20,"Govt Emp");
		Person p4 = new Person("Dhanu",54,"Electronic");
		Person p5 = new Person("Yogi",21,"Civil");
		Person p6 = new Person("Manu",46,"HR");
		Person p7 = new Person("Raju",18,"Mechanic");

		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);
		Stream<Person> stream = persons.stream();
		
		//Filter By age and Job >> lambda
		/*
		 * stream.filter((p) ->
		 * p.getAge()>=20&&p.getAge()<=30&&p.getJob().equals("Software")) .forEach((p)->
		 * System.out.println(p));
		 */
		 
		
		//Filter By only age >> Method  reference
		stream.filter((p) -> p.getAge()>=22&&p.getAge()<=30)
		.forEach(System.out::println);
		
		
	}

}
