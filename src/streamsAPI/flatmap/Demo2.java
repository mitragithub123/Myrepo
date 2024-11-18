package streamsAPI.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		List<String> teamA = Arrays.asList("Sachin", "Sehwag", "Ganguly");
		List<String> teamB = Arrays.asList("Dravid", "Laxman", "Yuvraj");
		List<String> teamC = Arrays.asList("Kaif", "Virat", "Rohit");

		List<List<String>> playersBeforeWorldCup = new ArrayList<List<String>>();
		playersBeforeWorldCup.add(teamA);
		playersBeforeWorldCup.add(teamB);
		playersBeforeWorldCup.add(teamC);

		// Before java 8
		for (List<String> team : playersBeforeWorldCup) {
			for (String name : team) {
				System.out.println(name);
			}
		}

		// After java 8
		playersBeforeWorldCup.stream().flatMap(s -> s.stream()).forEach(System.out::println);

	}

}
