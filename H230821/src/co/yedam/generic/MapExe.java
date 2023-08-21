package co.yedam.generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

class User {
	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;

		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return this.id.hashCode();
	}

	@Override
	public boolean equals(Object obj) {

		User target = (User) obj;
		return this.id.equals(target.id) && this.pw.equals(target.pw);
	}

	private String id;
	private String pw;
}

public class MapExe {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("hong", 80);
		map.put("kim", 95);
		map.put("bak", 70);

		Integer val = map.get("hong");

		System.out.println(val);

		List<User> users = new ArrayList<>();
		users.add(new User("user11", "1234"));

		Map<String, String> userMap = new HashMap<>();

		userMap.put("user11", "1234");

		userMap.put("user22", "1231");
		userMap.put("user33", "1232");
		userMap.put("user44", "1233");
		userMap.put("user55", "1244");

		if (userMap.containsKey("user2")) {
			System.out.println(userMap.get("user2"));
		}

		// key반환.

		Set<String> keyset = userMap.keySet();

		System.out.println(keyset);

		for (String key : keyset) {
			String vl = userMap.get(key);
			System.out.println("=============");
			System.out.println(key);
			System.out.println(vl);
			System.out.println("=============");
		}

		// map

		Map<User, String> umap = new HashMap<>();

		umap.put(new User("user1", "1111"), "hong");
		umap.put(new User("user2", "1234"), "kim");
		umap.put(new User("user3", "1324"), "park");

		String name = umap.get(new User("user1", "1111"));
		System.out.println(name);
	}
}
