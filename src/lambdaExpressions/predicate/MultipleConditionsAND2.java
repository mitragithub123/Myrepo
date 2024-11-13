package lambdaExpressions.predicate;

import java.util.function.Predicate;

public class MultipleConditionsAND2 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 67, 32, 44, 43, 12 };
		Predicate<Integer> p1 = number -> number % 2 == 0;
		Predicate<Integer> p2 = number -> number > 10;

		for (int i : arr) {
			if (p1.and(p2).test(i)) {//if(p1.test(i) && p2.test(i))
				System.out.println(i);
			}
		}
	}

}
