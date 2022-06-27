import java.util.Comparator;

public class MyPQSortedArray<K, V> extends MyAPQ<K, V> {
    private Array arr = new Array(1);

    public MyPQSortedArray() {
        super();
    }

    public MyPQSortedArray(Comparator<K> comp) {
        super(comp);
    }

    @Override

    public int size() {
        return arr.getNumEntries();
    }

    public Entry<K, V> insert(K key, V value) throws IllegalArgumentException {
        checkKey(key);
        Entry<K, V> newEntry = new PQEntry<>(key, value);
        int pos = -1;
        // Traverse the array
        for (int i = 0; i < arr.getNumEntries(); i++) {

            // If K is found
            if (arr.getElementAt(i).getKey() == key) {
                pos = i;
                break;
            }

            else if ((int) arr.getElementAt(i).getKey() > (int) key) {
                pos = i;
                break;
            }
        }
        if (pos == -1) pos = arr.getNumEntries();
        arr.add(newEntry, pos);
        return newEntry;
    }

    @Override
    public Entry<K, V> min() {
        if (arr.getNumEntries() < 0)
            return null;
        return arr.getElementAt(0);
    }

    @Override
    public Entry<K, V> removeMin() {
        if (arr.getNumEntries() < 0)
            return null;
        return arr.remove(0);
    }

}