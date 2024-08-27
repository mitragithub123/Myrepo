package string;

public class CountCharacterOccurrence {

	public static void main(String[] args) {
		String s = "Java programming java oops";
		int totalLengthCount = s.length(); // 26
		System.out.println("Total length of string: " + totalLengthCount);

		int lengthCountAfterReplacingChar = s.replace("a", "").length();
		System.out.println("Total length of string after character is replaced: " + lengthCountAfterReplacingChar);

		int count = totalLengthCount - lengthCountAfterReplacingChar;
		System.out.println("Count Character Occurrence: " + count);
	}

}
