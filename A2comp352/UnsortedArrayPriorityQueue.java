package A2comp352;

public class UnsortedArrayPriorityQueue<K extends Comparable<K>, V> implements PriorityQueue<K, V> {

	class PQEntry<K, V> implements Entry<K, V> {
		private K key;
		private V value;

		public PQEntry(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public K getKey() {
			return key;
		}

		public V getValue() {
			return value;
		}

		public String toString() {
			return "Key: " + this.key + " Value: " + this.value;
		}
	}

	Entry[] array = new Entry[1];
	private int size;

	public boolean isEmpty() {
		if (size <= 0) {
			return true;
		}
		return false;
	}

	public void insert(K key, V value) {
		PQEntry<K, V> entry = new PQEntry<K, V>(key, value);

		if (size >= array.length) {
			System.out.println("adding to array time of " + size + " and the length is " + array.length +"\n");
			Entry[] newarr = new PQEntry[2 * array.length];

			for (int x = 0; x < size; x++) {
				newarr[x] = array[x];
			}
			this.array = newarr;
			newarr = null;
			array[size] = entry;
			size++;
		} else {
			System.out.println(" First time adding size of " + size + " and the length is " + array.length+"\n");
			array[size] = entry;
			size++;
		}
	}

	public Entry<K, V> min() {
		if (isEmpty()) {
			System.out.println("queue is empty");
			return null;
		}
		return findMin();
	}

	public Entry<K, V> findMin() {
		PQEntry temp = (PQEntry) array[0];
		for (int x = 0; x < size; x++) {
			if (((Comparable<K>) temp.getKey()).compareTo((K) array[x].getKey()) == 1) {
				temp = (PQEntry) array[x];
			}
			continue;
		}

		return temp;
	}

	public Entry<K, V> removemin() {

		if (isEmpty()) {
			System.out.println("queue is empty");
			return null;
		}
		int checker = (int) 0.25 * array.length;
		PQEntry min = (PQEntry) findMin();
		int index = 0;
		Entry[] newarr;
		for (int x = 0; x < size; x++) {
			if (((Comparable<K>) min.getKey()).compareTo((K) array[x].getKey()) == 0) {
				array[x] = null;
				index = x;
				break;
			}
		}
		if (size < checker) {
			System.out.println(
					"The size less than 0.25 of the array is" + size + " and the length is " + array.length);

			newarr = new PQEntry[array.length / 2];

			for (int x = index; x < size ; x++) {
				newarr[x] = array[x + 1];
			}
			size--;
			for (int x = 0; x < index; x++) {
				newarr[x] = array[x];
			}
			
			array = newarr;
			newarr = null;
		}
		
		else {
			newarr = new PQEntry[array.length];

			for (int x = index; x < size - 1 ; x++) {
				newarr[x] = array[x + 1];
			}
			size--;
			for (int x = 0; x < index; x++) {
				newarr[x] = array[x];
			}
			
			array = newarr;
			newarr = null;
			
		}
		System.out.println(" index: " + index + " , size: " + size + " , length: " + array.length);

		return min;
	}

	public int size() {
		return size;
	}

	public void print() {
		for (int x = 0; x < size; x++) {
			System.out.println(array[x]);
		}
	}
}
