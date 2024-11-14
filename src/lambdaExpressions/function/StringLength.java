package lambdaExpressions.function;

import java.util.function.Function;

public class StringLength {

	public static void main(String[] args) {
		Function<String, Integer> f = str -> str.length();
		System.out.println(f.apply("Ram"));
		System.out.println(f.apply("Laxman"));

	}

}
