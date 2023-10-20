package ptplcop01;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class Example02 {
	public static void main(String[] args) {

		Locale loc = new Locale("en", "US");
		ResourceBundle bundle = ResourceBundle.getBundle("RB", loc);
		Enumeration<String> enumeration = bundle.getKeys();
		while (enumeration.hasMoreElements()) {
			String key = enumeration.nextElement();
			String val = bundle.getString(key);
			System.out.println(key + "=" + val);
		}
	}
}