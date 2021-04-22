package Praktikum4;

/**
 *
 * @author Nurul Arifin 19MI0016
 */

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args){
        PriorityQueue<String> stringQueue;
        stringQueue = new PriorityQueue<String>();
        stringQueue.add("ab");
        stringQueue.add("abcd");
        stringQueue.add("abc");
        stringQueue.add("a");
        
        //don't use iterator which may or may not
        //show the PriorityQueue's orser
        while(stringQueue.size() > 0)
            System.out.println(stringQueue.remove());        
    }
    
}
