package base;

import java.util.HashMap;
import java.util.Map;

public class DataProviderTestDataHashMapSignUp {
	public static Object[][] getSignUpData() {
		Map<String, String> signUpDataMap1 = new HashMap<>();
		signUpDataMap1.put("email", "dfwuef#gmail.com");//Invalid email format
		signUpDataMap1.put("password", "dfwuef");//Valid password

		Map<String, String> signUpDataMap2 = new HashMap<>();
		signUpDataMap2.put("email", "dfwuef@yahoo.com");//Valid email with other domain
		signUpDataMap2.put("password", "12345678");

		Map<String, String> signUpDataMap3 = new HashMap<>();
		signUpDataMap3.put("email", "andolasoft.user133@gmail.com");//Valid email id
		signUpDataMap3.put("password", "fwrfrw");//Valid password

		Map<String, String> signUpDataMap4 = new HashMap<>();
		signUpDataMap4.put("email", "");//Valid email
		signUpDataMap4.put("password", "");//Blank password

		Map<String, String> signUpDataMap5 = new HashMap<>();
		signUpDataMap5.put("email", "andolasoft.user133@gmail.com");//Duplicate email
		signUpDataMap5.put("password", "fwrfrw");//Valid password

		Map<String, String> signUpDataMap6 = new HashMap<>();
		signUpDataMap6.put("email", "andolasoft.user133@gmail.com");//Valid email
		signUpDataMap6.put("password", " ");//Blank password

		Map<String, String> signUpDataMap7 = new HashMap<>();
		signUpDataMap7.put("email", " ");//Blank email
		signUpDataMap7.put("password", "fryhr");////Valid password

		return new Object[][] { { signUpDataMap1 }, { signUpDataMap2 }, { signUpDataMap3 }, { signUpDataMap4 },
				{ signUpDataMap5 }, { signUpDataMap6 }, { signUpDataMap7 } };
	}
}