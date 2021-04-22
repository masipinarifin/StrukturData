package Praktikum4;

/**
 *
 * @author Nurul Arifin 19MI0016
 * 
 */

import java.util.HashMap;

public class CheckKeyOfHashMapExample {
    public static void main(String[] args){
        //create HashMap object
        HashMap hMap = new HashMap();
        
        //add key vvalue pairs to HashMap
        hMap.put("1", "One");
        hMap.put("2", "Two");
        hMap.put("3", "Three");
        
        boolean blnExists = hMap.containsKey("3");
        
        System.out.println("3 exists in HashMap? : " + blnExists);
    }

}
