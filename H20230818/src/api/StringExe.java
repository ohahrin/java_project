package api;

import java.io.UnsupportedEncodingException;

public class StringExe {
	public static void main(String[] args) {

		byte[] bytes = { 104, 101, 108, 108, 111 };
		String str = null;
		try {
			str = new String(bytes, 0, 5, "UTF-8");
			System.out.println(str);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}
}
