package streamsAPI.others;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {

	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(1, 3, 66, 12, 34, 48);
		List<Integer> sortedNumberList = numberList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNumberList);

		List<String> vehiclesList = Arrays.asList("bus", "car", "bike", "train", "plane", "tank");
		List<String> sortedvehiclesList = vehiclesList.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedvehiclesList);

	}

}
