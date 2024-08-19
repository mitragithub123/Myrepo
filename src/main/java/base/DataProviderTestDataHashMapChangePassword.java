package base;

import java.util.HashMap;
import java.util.Map;

public class DataProviderTestDataHashMapChangePassword {
	public static Object[][] getPasswordChangeData() {
		Map<String, String> passwordDataMap1 = new HashMap<>();
		passwordDataMap1.put("currentPassword", "eG\"]9M<3i{P9");
		passwordDataMap1.put("newPassword", "NewPass123!");
		passwordDataMap1.put("confirmPassword", "NewPass123!");

		Map<String, String> passwordDataMap2 = new HashMap<>();
		passwordDataMap2.put("currentPassword", "eG\"]9M<3i{P9");
		passwordDataMap2.put("newPassword", "NewPass123!");
		passwordDataMap2.put("confirmPassword", " ");

		Map<String, String> passwordDataMap3 = new HashMap<>();
		passwordDataMap3.put("currentPassword", "eG\"]9M<3i{P9");
		passwordDataMap3.put("newPassword", " ");
		passwordDataMap3.put("confirmPassword", "NewPass123!");

		Map<String, String> passwordDataMap4 = new HashMap<>();
		passwordDataMap4.put("currentPassword", "eG\"]9M<3i{P9");
		passwordDataMap4.put("newPassword", " ");
		passwordDataMap4.put("confirmPassword", " ");

		Map<String, String> passwordDataMap5 = new HashMap<>();
		passwordDataMap5.put("currentPassword", "eG\"]9M<3i{P9");
		passwordDataMap5.put("newPassword", "NewPassword1234");
		passwordDataMap5.put("confirmPassword", "NewPassword124");

		Map<String, String> passwordDataMap6 = new HashMap<>();
		passwordDataMap6.put("currentPassword", "eG\"]9M<3i{P9");
		passwordDataMap6.put("newPassword", "New Pass 123!");
		passwordDataMap6.put("confirmPassword", "New Pass 123!");

		Map<String, String> passwordDataMap7 = new HashMap<>();
		passwordDataMap7.put("currentPassword", "eG\"]9M<3i{P9");
		passwordDataMap7.put("newPassword", "!@#$%^&*()");
		passwordDataMap7.put("confirmPassword", "!@#$%^&*()");

		Map<String, String> passwordDataMap8 = new HashMap<>();
		passwordDataMap8.put("currentPassword", "eG\"]9M<3i{P9");
		passwordDataMap8.put("newPassword", "1234567890");
		passwordDataMap8.put("confirmPassword", "1234567890");

		return new Object[][] { { passwordDataMap1 }, { passwordDataMap2 }, { passwordDataMap3 }, { passwordDataMap4 },
				{ passwordDataMap5 }, { passwordDataMap6 }, { passwordDataMap7 }, { passwordDataMap8 } };
	}
}
