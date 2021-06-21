package Praktikum11;

/**
 *
 * NURUL ARIFIN 19MI0016
 * 
 */
public interface BQueue<T> {
    boolean isEmpty();
    T peek();
    T pop();
    void push(T item);
    int size();
    boolean full();
}
