package string;

public class CommonCharactersInThreeStrings {

	public static void main(String[] args) {
		String str1 = "abcde";
		String str2 = "aedif";
		String str3 = "heade";
		String commonChars = "";
		for (char c : str1.toCharArray()) {
			if (str1.indexOf(c) != -1 && str2.indexOf(c) != -1 && str3.indexOf(c) != -1) {
				commonChars += c;
			}
		}
		System.out.println("Common Characters: " + commonChars);

	}

}
