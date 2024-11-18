package lambdaExpressions.function;

import java.util.function.Function;

public class ReverseString {

	public static void main(String[] args) {
		Function<String, String> function = s -> new StringBuilder(s).reverse().toString();
		System.out.println(function.apply("Siku"));

	}

}
