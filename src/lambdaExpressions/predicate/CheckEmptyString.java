package lambdaExpressions.predicate;

import java.util.function.Predicate;

public class CheckEmptyString {

	public static void main(String[] args) {
		Predicate<String> p = str -> str.isEmpty();

		System.out.println(p.test("Siku"));
		System.out.println(p.test(""));
	}

}
