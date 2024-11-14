package streamsAPI.filter;

import java.util.Arrays;
import java.util.List;

public class FindNull {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Arya Strak", null, "Jon Snow", null, "Danerys Targeryan", "Sansa");
		list.stream().filter(s -> s != null).forEach(System.out::print);
	}
}
