package Properties;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Main {
	public static void main(String[] args) {

		Properties properties = new Properties();
		properties.put("Maharashtra", "Mumbai");
		properties.put("Delhi", "Purani delhi ");
		properties.put("Rajasthan", "Jaipur");
		properties.put("Kerala", "Thiruvananthapuram");

		Set set = properties.keySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			//System.out.println(string + " " + properties.getProperty(string));
		}

		String string = properties.getProperty("Delhi", "not found");
		System.out.println(string);

	}
}