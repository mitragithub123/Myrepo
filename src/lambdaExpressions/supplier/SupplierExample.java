package lambdaExpressions.supplier;

import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {
		Supplier<Integer> integerSupplier = () -> 42;
		System.out.println(integerSupplier.get());

	}

}
