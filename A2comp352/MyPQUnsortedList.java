package A2comp352;

public class MyPQUnsortedList<K extends Comparable<K>, V> implements PriorityQueue<K, V> {

    private int size;

    class PQEntry<K,V> implements Entry <K,V>{
        private K key;
        private V value;
        public PQEntry(K key, V value) {
            this.key=key;
            this.value= value;
        }

        public K getKey() {
            return key;
        }
        public V getValue() {
            return value;
        }
        public String toString() {
            return "["+this.key+":  "+ this.value + "]    -->   ";
        }
    }
    class Node{
        PQEntry<K, V> item;
        Node prev;
        Node nxt;

        public Node(PQEntry<K, V> item) {
            this.item = item;
        }
    }

    Node head, tail = null;

    
    //
    public void insert(K key, V value) {

        PQEntry<K, V> entry = new PQEntry<K,V>(key,value);

        Node nwnode = new Node(entry);

        if(head == null){
            head = tail = nwnode;
            head.prev = null;
            tail.nxt = null;
            size++;
        }else{
            tail.nxt = nwnode;
            nwnode.prev = tail;
            tail = nwnode;
            tail.nxt = null;
            size++;
        }
    }

    public Entry<K, V> min(){
        Node temp = head;
        PQEntry<K, V> minKey = temp.item;
        if(head == null) {
            System.out.println("Doubly linked list is empty");
            return null;
        }

        while (temp != null)
        {
            if(((Comparable<K>) temp.item.getKey()).compareTo(minKey.getKey()) < 0){
                minKey = temp.item;
            }
            temp = temp.nxt;
        }
        return minKey;
    }

    
    public Entry<K, V> removemin(){

        PQEntry<K, V> min = (PQEntry) min();
        if(min == null){
            return null;
        }
        Node temp = head;
        Node delete = null;
        while(temp != null){
            if(((Comparable<K>) min.getKey()).compareTo(head.item.getKey()) == 0){
                head = head.nxt;
                head.prev = null;
                size--;
            }
            else if(((Comparable<K>) temp.item.getKey()).compareTo(min.getKey()) == 0){
                temp.prev.nxt = temp.nxt;
                temp.nxt.prev = temp.prev;
                size--;
            }else if (((Comparable<K>) min.getKey()).compareTo(tail.item.getKey()) == 0){
                tail = tail.prev;
                tail.nxt = null;
                size--;
            }
            temp = temp.nxt;
        }
        return null;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty () {
        if(size<=0) {
            return true;
        }
        return false;
    }

    public void print(){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.item.toString());
            temp = temp.nxt;
        }
    }
}
