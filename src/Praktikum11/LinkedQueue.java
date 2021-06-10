package Praktikum11;

/**
 *
 * NURUL ARIFIN 19MI0016
 *
 */
import java.util.LinkedList;
import java.util.Queue;

public class LinkedQueue<T> implements Queue<T> {

    private LinkedList<T> qlist = null;

    public LinkedQueue() {
        qlist = new LinkedList<T>();
    }

    @Override
    public boolean isEmpty() {
        boolean result = false;
        if (qlist.size() <= 0) {
            result = true;
        }
        return result;
    }

    @Override
    public T peek() {
        return qlist.getFirst();
    }

    @Override
    public T pop() {
        return qlist.pop();
    }

    @Override
    public void push(T item) {
        qlist.push(item);
    }

    @Override
    public int size() {
        return qlist.size();
    }
}
