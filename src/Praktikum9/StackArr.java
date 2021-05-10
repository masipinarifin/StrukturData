package Praktikum9;

/**
 *
 * @Nurul Arifin
 * 
 */
import java.util.EmptyStackException;
public class StackArr<T> implement Stack<T> {
    T value[];
    int topOfStack;
    
    public StackArr(int size){
        value = (T[]) new Object[size];
    }
    @Override
    public boolean isEmpty(){
        return topOfStack == 0;
    }
}
