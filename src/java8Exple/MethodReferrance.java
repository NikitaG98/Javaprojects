package java8Exple;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class MethodReferrance
{
	public static void main(String[] args) {
		List<Integer> intSeq=Arrays.asList(1,2,3);
		intSeq.forEach(x -> System.out.println(x));


		List<Integer> intSeq1 = (List<Integer>) Arrays.asList(1, 2, 3);
		// intSeq1.forEach(x -> System.out.println(x + var));
		intSeq1.forEach(x -> System.out.println(x));
		System.out.println("++++++++++++");
		intSeq1.forEach(System.out::println);
		//System.out.println(x);
	}
}
//replace lambda expression with method reference(::) to improve readability