package lambdaExpressions.function;

import java.util.function.Function;

public class ToUpperCaseExample {

	public static void main(String[] args) {
		Function<String, String> f = str -> str.toUpperCase();
		System.out.println(f.apply("Ram"));
		System.out.println(f.apply("Laxman"));

	}
}
