package lambdaExpressions.predicate;

import java.util.function.Predicate;

// Check the length of a string is greater than 4 or not
public class CheckStringLength {

	public static void main(String[] args) {
		Predicate<String> p = str -> str.length() > 4;

		System.out.println(p.test("Siku"));
		System.out.println(p.test("Mitra"));
	}

}
