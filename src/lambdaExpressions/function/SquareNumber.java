package lambdaExpressions.function;

import java.util.function.Function;

public class SquareNumber {

	public static void main(String[] args) {
		Function<Integer, Integer> f = n -> n * n;
		System.out.println(f.apply(5));
		System.out.println(f.apply(6));
		System.out.println(f.apply(7));
		System.out.println(f.apply(8));

	}

}
