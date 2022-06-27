import java.util.Comparator;

public class MyPQSortedList<K, V> extends MyAPQ<K, V> {
    private LinkedList<Entry<K, V>> list = new LinkedList<>();

    public MyPQSortedList() {
        super();
    }

    public MyPQSortedList(Comparator<K> comp) {
        super(comp);
    }

    @Override
    public int size() {
        return list.size();
    }

    public Entry<K, V> insert(K key, V value) throws IllegalArgumentException {
        checkKey(key);
        Entry<K, V> newEntry = new PQEntry<>(key, value);
        Position<Entry<K, V>> walk = list.last();
        while (walk != null && compare(newEntry, walk.getElement()) < 0)
            walk = list.before(walk);
        if (walk == null)
            list.addFirst(newEntry);
        else
            list.addAfter(walk, newEntry);
        return newEntry;
    }

    @Override
    public Entry<K, V> min() {
        if (list.isEmpty())
            return null;
        return list.first().getElement();
    }

    @Override
    public Entry<K, V> removeMin() {
        if (list.isEmpty())
            return null;
        return list.remove(list.first());
    }

    public void TraversePriorityQueue() {
        for (Position<Entry<K, V>> position : list.positions())
            System.out.println(position.getElement().getValue());

    }
}
