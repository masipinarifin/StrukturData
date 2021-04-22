package Praktikum4;

/**
 *
 * @author Nurul Arifin 19MI0016
 * 
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class IterateValuesOfHashMapExample {
    public static void main(String[] args){
        //Create HashMap object
        HashMap hMap = new HashMap();
        
        //add key value pairs to HashMap
        hMap.put("!", "One");
        hMap.put("2", "Two");
        hMap.put("3", "There");
        
        Collection c = hMap.values();
        //obtain an Iterator for COllection
        Iterator itr = c.iterator();
        
        //iterate through HashMap Values iterator
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
