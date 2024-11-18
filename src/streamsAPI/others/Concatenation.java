package streamsAPI.others;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concatenation {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("A", "B", "C");
		List<String> list2 = Arrays.asList("D", "E", "F");

		Stream<String> list1Stream = list1.stream();
		Stream<String> list2Stream = list2.stream();

		List<String> combinedList = Stream.concat(list1Stream, list2Stream).collect(Collectors.toList());
		System.out.println(combinedList);

	}

}
