package lambdaExpressions.function;

import java.util.function.Function;

public class SquareRootExample {

	public static void main(String[] args) {
		Function<Integer, Double> f = n -> Math.sqrt(n);
		System.out.println(f.apply(5));
		System.out.println(f.apply(6));
		System.out.println(f.apply(7));
		System.out.println(f.apply(8));
		System.out.println(f.apply(9));
	}
}
