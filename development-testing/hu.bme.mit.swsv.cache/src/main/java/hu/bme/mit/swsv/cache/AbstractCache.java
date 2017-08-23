package hu.bme.mit.swsv.cache;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractCache<K,V extends Comparable<V>> {
	
	Map<K,V> map;
	Map<K,Integer> ttl;
	
	private static final int TTL = 5;
	
	protected AbstractCache() {
		map = new LinkedHashMap<K,V>();
		ttl = new LinkedHashMap<K, Integer>();
	}

	public V get(K key) {
		update();
		ttl.put(key, TTL);
		return map.get(key);
	}
	
	public LinkedHashMap<K,V> getAll(List<K> keys) {
		update();
		LinkedHashMap<K,V> result = new LinkedHashMap<K,V>();
		for(K key : keys) {
			if(map.containsKey(key)) {
				result.put(key, map.get(key));
				ttl.put(key, TTL);
			}
		}
		return result;
	}
	
	public void put(K key, V value, boolean force) {
		if(force || !map.containsKey(key)) {
			map.put(key, value);
			ttl.put(key, TTL);
		} else {
			throw new IllegalArgumentException("This key has been already added to the cache.");
		}
	}
	
	protected void putAll(Map<? extends K, ? extends V> m) {
		for(Map.Entry<? extends K, ? extends V> entry : m.entrySet()) {
			map.put(entry.getKey(), entry.getValue());
			ttl.put(entry.getKey(), TTL);
		}
	}
	
	public V remove(K key) {
		try {
			Thread.sleep(2000);
		} catch(InterruptedException e) {}
		ttl.remove(key);
		return map.remove(key);
	}
	
	public void update() {
		for(K k : map.keySet()) {
			Integer remaining = ttl.get(k);
			remaining--;
			if(remaining == -1) {
				map.remove(k);
				ttl.remove(k);
			} else {
				ttl.put(k, remaining);
			}
		}
	}
}
