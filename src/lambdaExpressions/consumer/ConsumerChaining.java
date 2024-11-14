package lambdaExpressions.consumer;

import java.util.function.Consumer;

public class ConsumerChaining {

	public static void main(String[] args) {
		Consumer<String> c1 = s -> System.out.println(s + " is an animal.");
		Consumer<String> c2 = s -> System.out.println(s + " has 4 legs.");
		Consumer<String> c3 = s -> System.out.println(s + " is our mother.");

		/*c1.accept("Cow");
		c2.accept("Cow");
		c3.accept("Cow");*/
		
		//c1.andThen(c2).andThen(c3).accept("Cow");
		
		Consumer<String> c = c1.andThen(c2).andThen(c3);
		c.accept("Cow");

	}

}
