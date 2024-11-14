package streamsAPI.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		List<Integer> evenList = new ArrayList<Integer>();

		evenList = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(evenList);

		// or,
		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

		// or,
		list.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));

		// Without using streams
		for (int i : list) {
			if (i % 2 == 0) {
				evenList.add(i);
			}
		}
		System.out.println(evenList);

	}
}
