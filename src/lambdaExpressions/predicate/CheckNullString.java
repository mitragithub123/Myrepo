package lambdaExpressions.predicate;

import java.util.function.Predicate;

public class CheckNullString {

	public static void main(String[] args) {
		Predicate<String> p = str -> str == null;

		System.out.println(p.test("Siku"));
		System.out.println(p.test(null));
	}

}
