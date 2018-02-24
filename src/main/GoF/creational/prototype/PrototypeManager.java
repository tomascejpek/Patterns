package main.GoF.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Tomas Cejpek on 24/02/2018.
 */
public class PrototypeManager {

	private final Map<String, Person> cache;

	public PrototypeManager() {
		this.cache = new HashMap<>();
	}

	public void register(String key, Person person) {
		this.cache.put(key, person);
	}

	public void unregister(String key) {
		this.cache.remove(key);
	}

	public Person clone(String key) throws CloneNotSupportedException {
		if (!this.cache.containsKey(key)) return null;
		return this.cache.get(key).clone();
	}
}
