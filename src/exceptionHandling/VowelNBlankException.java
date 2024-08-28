package exceptionHandling;

import java.util.Scanner;

class VowelException extends Exception {
	VowelException(String msg) {
		super(msg);
	}
}

class BlankException extends Exception {
	BlankException(String msg) {
		super(msg);
	}
}

public class VowelNBlankException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a character: ");
		String str = sc.nextLine();

		try {
			if (str.isEmpty()) {
				throw new BlankException("Input cannot be blank.");
			}
			
			char ch = str.charAt(0); // Get 1st char from string
			
			if (ch == ' ') {
				throw new BlankException("Input cannot be a space.");
        	}
        	else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        		    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        		throw new VowelException("Entered character '" + ch + "' is a vowel.");
			} 
        	else if (Character.isLetter(ch)) {
				System.out.println("Entered character '" + ch + "' is a consonant.");
			} 
        	else {
				System.out.println("Entered character '" + ch + "' is not a letter.");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
		}

	}

}
