package base;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDataReader {
	public static List<HashMap<String, String>> getJsonDataToMap(String filePath) throws IOException {
		// Json file path
		
		  /*String path = System.getProperty("user.dir") + File.separator + "src" +
		  File.separator + "test" + File.separator + "java" + File.separator +
		  "resources" + File.separator + "login.json";*/
		 
		String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator
				+ "java" + File.separator + "resources" + File.separator + "signup.json";

		// Read json content from file
		String jsonContent = FileUtils.readFileToString(new File(path), StandardCharsets.UTF_8);

		/* String to hash map Jackson bind */
		// Initialize ObjectMapper
		ObjectMapper mapper = new ObjectMapper();

		// Read JSON content into a List<HashMap<String, String>> using TypeReference
		List<HashMap<String, String>> data = mapper.readValue(jsonContent,
				new TypeReference<List<HashMap<String, String>>>() {
				});
		return data;
	}
}
