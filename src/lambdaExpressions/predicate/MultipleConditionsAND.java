package lambdaExpressions.predicate;

import java.util.function.Predicate;

public class MultipleConditionsAND {

	public static void main(String[] args) {
		Predicate<Integer> p1 = number -> number % 2 == 0;
		Predicate<Integer> p2 = number -> number > 10;

		Predicate<Integer> p = p1.and(p2);

		System.out.println(p.test(11));
		System.out.println(p.test(12));
		System.out.println(p.test(3));
		System.out.println(p.test(4));

	}

}
