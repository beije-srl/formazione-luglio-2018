package utils;

import java.util.Random;

import org.apache.commons.codec.binary.Hex;
import org.springframework.util.DigestUtils;

public class Utilis {

	public static String MD5(String text)
	{
		return DigestUtils.md5DigestAsHex(text.getBytes());
	}
	
	public static String generateToken()
	{
		byte[] b = new byte[25];
		new Random().nextBytes(b);
		return Hex.encodeHexString(b);
	}
}
