package demo;

import org.json.simple.JSONObject;

public class JsonDemo {
	public static void main(String[] args) {
		JSONObject jo = new JSONObject();
		
		jo.put("username", "dnhao");
		jo.put("password", "dnhao");
		System.out.println(jo);
		System.out.println(jo.get("username"));
	}
}
