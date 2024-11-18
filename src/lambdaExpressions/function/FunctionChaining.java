package lambdaExpressions.function;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
		Function<Integer, Integer> f1 = n -> n * 2;
		Function<Integer, Integer> f2 = n -> n * n * n;

		System.out.println(f1.andThen(f2).apply(5)); // f1 will evaluate 1st then f2
		System.out.println(f1.compose(f2).apply(5)); // f2 will evaluate 1st then f1

	}

}
