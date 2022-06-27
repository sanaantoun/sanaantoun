public interface MyPQ<K, V> {

    Entry<K, V>  insert(K key, V value);

    Entry<K, V> min();

    Entry<K, V> removeMin();

    int size();

    boolean isEmpty();
}
