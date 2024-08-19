package testcomponents;

import java.util.Random;

public class RandomStringGenerator {

	private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

	public String generateRandomString(int length) {
		if (length <= 0) {
			throw new IllegalArgumentException("Length must be positive");
		}
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < length; i++) {
			int index = random.nextInt(CHARACTERS.length());
			sb.append(CHARACTERS.charAt(index));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		RandomStringGenerator generator = new RandomStringGenerator();
		String randomString = generator.generateRandomString(15);
		System.out.println("Generated random string: " + randomString);
	}
}
