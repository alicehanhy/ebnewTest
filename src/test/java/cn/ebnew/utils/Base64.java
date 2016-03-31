package cn.ebnew.utils;

import java.io.UnsupportedEncodingException;
import sun.misc.*;
public class Base64 {
	public static String getBase64(String str1, String str2) {
		byte[] b = null;
		String s = str1 + str2;
		String base64 = null;
		try {
			b = s.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (b != null) {
			base64 = new BASE64Encoder().encode(b);
		}
		return base64;
	}
}
