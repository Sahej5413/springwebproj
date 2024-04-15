package org.ass.springweb.util;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EDUtil {
	public static String encode(String data) {
		if (data == null)
			return null;
		return Base64.getEncoder().encodeToString(data.getBytes());
	}

	public static String decode(String encodedData) {
		if (encodedData == null)
			return null;
		byte[] decodedBytes = Base64.getDecoder().decode(encodedData.getBytes());
		return new String(decodedBytes, StandardCharsets.UTF_8);
	}
}
