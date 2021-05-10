package Praktikum9;

/**
 *
 * @NURUL ARIFIN 19MI0016
 * 
 */
public interface Stack<T> {
    abstract boolean isEmpty();
    abstract T peek();
    abstract T pop();
    abstract void push(T item);
    abstract int size();    
}
