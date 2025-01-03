package string;

// Input: I am mitra
// Output: mitra am I
public class ReverseSpecial1 {

	public static void main(String[] args) {
		String sentence = "I am mitra";
		String[] words = sentence.split(" ");
		String reverse = "";
		for (int i = words.length - 1; i >= 0; i--) {
			reverse = reverse + words[i] + " ";
		}
		System.out.println(reverse);
	}

}
