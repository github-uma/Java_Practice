package algorithms;

import java.util.Map;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class CompareFiles {

	public static void main(String[] args) {
		JsonParser parser = new JsonParser();
		String objectString = "{\"customer\": {\"fullName\": \"Emily Jenkins\", \"age\": 27 }}";
		String arrayString = "[10, 20, 30]";

		JsonElement json1 = parser.parse(objectString);
		JsonElement json2 = parser.parse(arrayString);

		System.out.println(json1);
		System.out.println(json2);
	}

}
