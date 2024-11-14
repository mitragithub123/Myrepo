package lambdaExpressions.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListConsumerExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Bob", "Alice", "Lexa");

		Consumer<String> c = s -> System.out.println(s);
		list.forEach(c);

	}

}
