package collection.list;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListEx1 {

	public static void main(String[] args) {
		String arr[] = { "Dog", "Cat", "Elephant" };
		ArrayList<String> al = new ArrayList<>(Arrays.asList(arr));
		System.out.println(al);

	}

}
