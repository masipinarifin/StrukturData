package Praktikum11;

/**
 *
 * NURUL ARIFIN 19MI0016
 * 
 */

public class ArrQueue<T> implements BQueue<T> {

    private T Arr[];
    private int qfront = 0;
    private int qback = 0;
    private int qcapacity = 0;

    public ArrQueue() {
        Arr = (T[]) new Object[50];
        qcapacity = 50;
    }

    public ArrQueue(int size) {
        Arr = (T[]) new Object[size];
        qcapacity = size;
    }

    @Override
    public boolean isEmpty() {
        
    }

    @Override
    public T peek() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public T pop() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void push(T item) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean full() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
