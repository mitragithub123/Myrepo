package streamsAPI.others;

import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		List<String> vehicles = Arrays.asList("bus", "car", "bike", "bus", "car", "bike");

		// Distinct (Here removing duplicate strings from list)
		vehicles.stream().distinct().forEach(System.out::println);

		// Count
		long count = vehicles.stream().distinct().count();
		System.out.println(count);

		// Limit
		vehicles.stream().limit(4).forEach(System.out::println);

	}

}
