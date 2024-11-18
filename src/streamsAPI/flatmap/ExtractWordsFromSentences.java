package streamsAPI.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExtractWordsFromSentences {

	public static void main(String[] args) {
		List<String> sentences = Arrays.asList("Java is fun", "Streams are powerful", "FlatMap is useful");
		List<String> words = sentences.stream().flatMap(s -> Arrays.stream(s.split(" "))).collect(Collectors.toList());
		System.out.println(words);

	}

}
