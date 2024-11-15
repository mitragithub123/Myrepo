package streamsAPI.map;

import java.util.Arrays;
import java.util.List;

public class ConvertStringToInteger {

	public static void main(String[] args) {
		List<String> numbers = Arrays.asList("1", "2", "3", "4", "5");
		numbers.stream().map(s -> Integer.parseInt(s)).forEach(System.out::println);
		// or
		numbers.stream().map(Integer::parseInt).forEach(System.out::println);

	}

}
