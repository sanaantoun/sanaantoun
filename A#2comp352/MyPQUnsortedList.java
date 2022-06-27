import java.util.Comparator;

public class MyPQUnsortedList<K, V> extends MyAPQ<K, V> {
    private LinkedList<Entry<K, V>> list = new LinkedList<>();

    public MyPQUnsortedList() {
        super();
    }

    public MyPQUnsortedList(Comparator<K> comp) {
        super(comp);
    }

    private Position<Entry<K, V>> findMin() {
        Position<Entry<K, V>> small = list.first();
        for (Position<Entry<K, V>> walk : list.positions())
            if (compare(walk.getElement(), small.getElement()) < 0)
                small = walk;
        return small;
    }

    @Override
    public Entry<K, V> insert(K key, V value) throws IllegalArgumentException {
        checkKey(key);
        Entry<K, V> newEntry = new PQEntry<>(key, value);
        list.addLast(newEntry);
        return newEntry;
    }

    @Override
    public Entry<K, V> min() {
        if (list.isEmpty())
            return null;
        return findMin().getElement();
    }

    @Override
    public Entry<K, V> removeMin() {
        if (list.isEmpty())
            return null;
        return list.remove(findMin());
    }

    @Override
    public int size() {
        return list.size();
    }

    public void TraversePositionalList() {
        for (Position<Entry<K, V>> elem : list.positions())
            System.out.println(elem.getElement().getValue());
    }

    public void TraversePriorityQueue() {
        while (list.size() > 0) {
            System.out.println(removeMin().getValue());
        }
    }
}
