import java.util.concurrent.*;

class CHM {

	ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();

	int getLength(String s) {
		return map.get(s).length();
	}

	void put(String k, String v) {
		if (k == null)
			map.put(k, v);
	}
}
