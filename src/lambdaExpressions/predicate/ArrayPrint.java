package lambdaExpressions.predicate;

import java.util.function.Predicate;

public class ArrayPrint {

	public static void main(String[] args) {
		Predicate<String> p = str -> str.length() > 4;
		String names[] = { "Ram", "Laxman", "Bharat", "Shatrughna" };
		for (String name : names) {
			if (p.test(name)) {
				System.out.println(name);
			}
		}

	}

}
