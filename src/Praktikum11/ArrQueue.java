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
    private int currentSize = 0;

    public ArrQueue() {
        Arr = (T[]) new Object[50];
        qcapacity = 50;
        currentSize = 0;
        qfront = -1;
        qback = -1;
    }

    public ArrQueue(int size) {
        Arr = (T[]) new Object[size];
        qcapacity = size;
        currentSize = 0;
        qfront = -1;
        qback = -1;
    }

    @Override
    public boolean isEmpty() {
        return (currentSize == 0);
    }

    @Override
    public T peek() {
        T peekElement;
        if (isEmpty()) {
            throw new QueueEmptyException("Circular Queue kosong! Elemen tidak dapat diambil.");
        } else {
            peekElement = Arr[qfront];
        }
        return peekElement;
    }

    @Override
    public T pop() {
        T deQueuedElement;
        if (isEmpty()) {
            throw new QueueEmptyException("Circular Queue kosong! Elemen tidak dapat diambil.");
        } else {
            deQueuedElement = Arr[qfront];
            Arr[qfront] = null;
            qfront = (qfront + 1) % Arr.length;
            currentSize--;
        }
        return deQueuedElement;
    }

    @Override
    public void push(T item) {
        if (full()) {
            throw new QueueFullException("Circular Queue Penuh! Elemen tidak dapat ditambah.");
        } else {
            qback = (qback + 1) % Arr.length;
            Arr[qback] = item;
            currentSize++;

            if (qfront == -1) {
                qfront = qback;
            }
        }

    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public boolean full() {
        return (currentSize == Arr.length);
    }
}

class QueueFullException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public QueueFullException() {
        super();
    }

    public QueueFullException(String message) {
        super(message);
    }

}

class QueueEmptyException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public QueueEmptyException() {
        super();
    }

    public QueueEmptyException(String message) {
        super(message);
    }

}
