package streamsAPI.others;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo3 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C", "1", "2", "3");

		// reduce (Here concatenation)
		Optional<String> reduced = list.stream().reduce((value, combinedValue) -> {
			return value + combinedValue;
		});
		System.out.println(reduced.get());

	}

}
