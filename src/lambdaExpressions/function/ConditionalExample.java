package lambdaExpressions.function;

import java.util.function.Function;

public class ConditionalExample {

	public static void main(String[] args) {
		Function<Integer, String> f = n -> n % 2 == 0 ? "Even" : "Odd";
		System.out.println(f.apply(4));
		System.out.println(f.apply(5));
	}
}
