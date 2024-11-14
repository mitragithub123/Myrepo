package streamsAPI.filter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemovingDuplicates {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "cherry", "banana", "apple");
		Set<String> set = new HashSet<String>();
		set = list.stream().filter(word -> word.length() > 3).collect(Collectors.toSet());
		System.out.println(set);

	}

}
