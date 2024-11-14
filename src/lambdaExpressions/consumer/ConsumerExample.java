package lambdaExpressions.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<String> c = str -> System.out.println(str);
		c.accept("Jai Sriram");
	}
}
