import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<E> {
    private static class Node<E> implements Position<E> {

        private E element;

        private Node<E> prev;

        private Node<E> next;

        public Node(E e, Node<E> p, Node<E> n) {
            element = e;
            prev = p;
            next = n;
        }


        public E getElement() throws IllegalStateException {
            if (next == null)
                throw new IllegalStateException("Position no longer valid");
            return element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setElement(E e) {
            element = e;
        }

        public void setPrev(Node<E> p) {
            prev = p;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }

    private Node<E> head;

    private Node<E> trail;

    private int size = 0;

    public LinkedList() {
        head = new Node<>(null, null, null);
        trail = new Node<>(null, head, null);
        head.setNext(trail);
    }

    private Node<E> validate(Position<E> p) throws IllegalArgumentException {
        if (!(p instanceof Node)) throw new IllegalArgumentException("Invalid p");
        Node<E> node = (Node<E>) p;
        if (node.getNext() == null)
            throw new IllegalArgumentException("p is no longer in the list");
        return node;
    }

    private Position<E> position(Node<E> node) {
        if (node == head || node == trail)
            return null;
        return node;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public Position<E> first() {
        return position(head.getNext());
    }

    public Position<E> last() {
        return position(trail.getPrev());
    }

    public Position<E> before(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return position(node.getPrev());
    }

    public Position<E> after(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        return position(node.getNext());
    }

    private Position<E> addBetween(E e, Node<E> pred, Node<E> succ) {
        Node<E> newNode = new Node<>(e, pred, succ);  // create and link a new node
        pred.setNext(newNode);
        succ.setPrev(newNode);
        size++;
        return newNode;
    }

    public Position<E> addFirst(E e) {
        return addBetween(e, head, head.getNext());       // just after the header
    }

    public Position<E> addLast(E e) {
        return addBetween(e, trail.getPrev(), trail);     // just before the trailer
    }

    public Position<E> addBefore(Position<E> p, E e)
            throws IllegalArgumentException {
        Node<E> node = validate(p);
        return addBetween(e, node.getPrev(), node);
    }

    public Position<E> addAfter(Position<E> p, E e)
            throws IllegalArgumentException {
        Node<E> node = validate(p);
        return addBetween(e, node, node.getNext());
    }

    public E set(Position<E> p, E e) throws IllegalArgumentException {
        Node<E> node = validate(p);
        E answer = node.getElement();
        node.setElement(e);
        return answer;
    }

    public E remove(Position<E> p) throws IllegalArgumentException {
        Node<E> node = validate(p);
        Node<E> predecessor = node.getPrev();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrev(predecessor);
        size--;
        E answer = node.getElement();
        node.setElement(null);           // help with garbage collection
        node.setNext(null);              // and convention for defunct node
        node.setPrev(null);
        return answer;
    }

    private class PositionIterator implements Iterator<Position<E>> {


        private Position<E> cursor = first();   // position of the next element to report

        private Position<E> recent = null;       // position of last reported element

        public boolean hasNext() {
            return (cursor != null);
        }

        public Position<E> next() throws NoSuchElementException {
            if (cursor == null) throw new NoSuchElementException("nothing left");
            recent = cursor;           // element at this position might later be removed
            cursor = after(cursor);
            return recent;
        }

        public void remove() throws IllegalStateException {
            if (recent == null) throw new IllegalStateException("nothing to remove");
            LinkedList.this.remove(recent);
            recent = null;
        }
    }


    private class PositionIterable implements Iterable<Position<E>> {
        public Iterator<Position<E>> iterator() {
            return new PositionIterator();
        }
    }

    public Iterable<Position<E>> positions() {
        return new PositionIterable();
    }

    private class ElementIterator implements Iterator<E> {
        Iterator<Position<E>> posIterator = new PositionIterator();

        public boolean hasNext() {
            return posIterator.hasNext();
        }

        public E next() {
            return posIterator.next().getElement();
        } // return element!

        public void remove() {
            posIterator.remove();
        }
    }

    public Iterator<E> iterator() {
        return new ElementIterator();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        Node<E> walk = head.getNext();
        while (walk != trail) {
            sb.append(walk.getElement());
            walk = walk.getNext();
            if (walk != trail)
                sb.append(", ");
        }
        sb.append(")");
        return sb.toString();
    }
}