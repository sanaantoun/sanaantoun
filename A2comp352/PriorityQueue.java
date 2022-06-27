package A2comp352;

public interface PriorityQueue<K,V> {
	public void insert(K key, V value);
	Entry<K,V> min();
	Entry<K,V> removemin();
	int size();
	boolean isEmpty();
}
