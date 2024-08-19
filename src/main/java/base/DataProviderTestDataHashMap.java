package base;

import java.util.HashMap;
import java.util.Map;

public class DataProviderTestDataHashMap {
	public static Object[][] getLoginData() {
		Map<String, String> loginDataMap1 = new HashMap<>();
		loginDataMap1.put("email", "dfwuef@gmail.com");//Valid email
		loginDataMap1.put("password", "dfwuef");//Invalid password

		Map<String, String> loginDataMap2 = new HashMap<>();
		loginDataMap2.put("email", "dfwuef@gmail.com");//Invalid password
		loginDataMap2.put("password", "12345678");//Invalid password

		Map<String, String> loginDataMap3 = new HashMap<>();
		loginDataMap3.put("email", "andolasoft.user133@gmail.com");//Valid email
		loginDataMap3.put("password", "fwrfrw");//Invalid password

		Map<String, String> loginDataMap4 = new HashMap<>();
		loginDataMap4.put("email", "");//Blank email
		loginDataMap4.put("password", "");//Blank password

		Map<String, String> loginDataMap5 = new HashMap<>();
		loginDataMap5.put("email", "andolasoft.user133@gmail.com");//Valid email
		loginDataMap5.put("password", "12345678");//Valid password

		return new Object[][] { { loginDataMap1 }, { loginDataMap2 }, { loginDataMap3 }, { loginDataMap4 },
				{ loginDataMap5 } };
	}
}