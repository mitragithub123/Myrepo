package streamsAPI.others;

import java.util.Arrays;
import java.util.List;

public class Demo4 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C", "1", "2", "3");
		Object[] arr = list.stream().toArray();
		System.out.println("Legth of array: " + arr.length);
		for (Object v : list) {
			System.out.println(v);
		}
	}
}
