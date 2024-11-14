package streamsAPI.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Arya Strak", "Jon Snow", "Danerys Targeryan", "Sansa");
		List<String> names = new ArrayList<String>();

		names = list.stream().filter(s -> s.length() >= 6 && s.length() <= 8).collect(Collectors.toList());
		System.out.println(names);

		// or
		list.stream().filter(s -> s.length() >= 6 && s.length() <= 8).forEach(System.out::print);

	}

}
