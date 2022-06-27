public class Array {

    private int numEntries = 0;
    private Entry[] entries;

    public Array(int capacity) {
        entries = new Entry[capacity];
    }

    public Entry getElementAt(int i) {
        return entries[i];
    }

    public int getNumEntries() {
        return numEntries;
    }

    public void add(Entry e) {
        var newValue = e.getValue();
        if (numEntries < entries.length)
            numEntries++;
        else {
            Entry[] temp = new Entry[entries.length * 2];

            for (int i = 0; i < entries.length; i++) {
                temp[i] = entries[i];
            }
            entries = temp;
            numEntries++;
        }
        entries[numEntries-1] = e;
    }


    public void add(Entry e, int pos) {
        var newValue = e.getValue();
        if (numEntries < entries.length)
            numEntries++;
        else {
            Entry[] temp = new Entry[entries.length * 2];

            for (int i = 0; i < entries.length; i++) {
                temp[i] = entries[i];
            }
            entries = temp;
            numEntries++;
        }
        Entry newarr[] = new Entry[entries.length + 1];
        for (int i = 0; i < entries.length + 1; i++) {
            if (i < pos)
                newarr[i] = entries[i];
            else if (i == pos)
                newarr[i] = e;
            else
                newarr[i] = entries[i - 1];
        }

        entries = newarr;
    }


    public Entry remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= numEntries)
            throw new IndexOutOfBoundsException("Invalid index: " + i);

        Entry temp = entries[i];
        for (int j = i; j < numEntries - 1; j++)
            entries[j] = entries[j + 1];

        entries[numEntries - 1] = null;
        numEntries--;

        if (numEntries < 0.25 * entries.length && numEntries > 10) {
            Entry[] tempA = new Entry[(int) Math.floor(entries.length * 0.5)];

            for (i = 0; i < tempA.length; i++) {
                tempA[i] = entries[i];
            }
            entries = tempA;
        }
        return temp;
    }
}
