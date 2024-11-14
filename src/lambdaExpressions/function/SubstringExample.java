package lambdaExpressions.function;

import java.util.function.Function;

public class SubstringExample {
	public static void main(String[] args) {
		Function<String, String> f = str -> str.substring(0, 2);
		System.out.println(f.apply("Ram"));
		System.out.println(f.apply("Laxman"));

	}
}
