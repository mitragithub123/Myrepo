package lambdaExpressions.predicate;

import java.util.function.Predicate;

//  To test if a number is even.
public class NegatingPredicate {

	public static void main(String[] args) {
		Predicate<Integer> p = number -> number % 2 == 0;
		Predicate<Integer> np = p.negate();

		System.out.println(np.test(4));
		System.out.println(np.test(5));
	}
}
