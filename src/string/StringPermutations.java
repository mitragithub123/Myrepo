package string;

/*All permutations of the string "ABC":
ABC
ACB
BAC
BCA
CAB
CBA*/
public class StringPermutations {
	public static void generatePermutations(String str, String perm) {
		if (str.isEmpty()) {
			System.out.println(perm);
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			String remaining = str.substring(0, i) + str.substring(i + 1);
			generatePermutations(remaining, perm + currentChar);
		}
	}

	public static void main(String[] args) {
		String input = "ABC";
		System.out.println("All permutations of the string \"" + input + "\":");
		generatePermutations(input, "");
	}
}
