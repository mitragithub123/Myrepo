package lambdaExpressions.supplier;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.function.Supplier;

public class DateDemo {

	public static void main(String[] args) {
		Supplier<LocalDateTime> s = () -> LocalDateTime.now();
		System.out.println(s.get());

		Supplier<Instant> s1 = () -> Instant.now();
		System.out.println(s1.get());
	}
}
