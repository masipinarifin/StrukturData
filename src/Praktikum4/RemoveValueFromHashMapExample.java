package Praktikum4;

/**
 *
 * @author Nurul Arifin 19MI0016
 * 
 */

import java.util.HashMap;

public class RemoveValueFromHashMapExample {
    public static void main(String[] args){
        //Create HashMap object
        HashMap hMap = new HashMap();
        
        //add key value pairs to HashMap
        hMap.put("!", "One");
        hMap.put("2", "Two");
        hMap.put("3", "There");
        
        Object obj = hMap.remove("2");
        System.out.println(obj + " Removed from HashMap");
        hMap.clear();
        System.out.println("Total key value pairs in HashMap are : " + hMap.size());
    }
    
}
