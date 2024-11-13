package lambdaExpressions.predicate;

import java.util.function.Predicate;

//  To test if a number is even.
public class BasicPredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> p = number -> number % 2 == 0;
		System.out.println(p.test(4));
		System.out.println(p.test(5));
	}
}
