import java.util.Comparator;

public class MyPQUnsortedArray<K, V> extends MyAPQ<K, V> {
    private Array arr = new Array(1);

    public MyPQUnsortedArray() {
        super();
    }

    public MyPQUnsortedArray(Comparator<K> comp) {
        super(comp);
    }

    private int findMin() {
        int min = 0;
        Entry elMin = null;
        Entry elem = null;
        for (int i = 0; i < arr.getNumEntries(); i++) {
            elem = arr.getElementAt(i);
            elMin = arr.getElementAt(min);
            if ((int) elMin.getKey() > (int) elem.getKey()) min = i;
        }
        return min;
    }

    @Override
    public Entry<K, V> insert(K key, V value) throws IllegalArgumentException {
        checkKey(key);
        Entry<K, V> newEntry = new PQEntry<>(key, value);
        arr.add(newEntry);
        return newEntry;
    }

    @Override
    public Entry<K, V> min() {
        if (arr.getNumEntries()<0)
            return null;
        return arr.getElementAt(findMin());
    }

    @Override
    public Entry<K, V> removeMin() {
        if (arr.getNumEntries()<0)
            return null;
        return arr.remove(findMin());
    }

    @Override
    public int size() {
        return arr.getNumEntries();
    }

}