package Praktikum4;

/**
 *
 * @author Nurul Arifin 19MI0016
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class CreateArrayListFromEnumerationExample {
    public static void main(String[] args){
        
        //Create a Vector Object
        Vector v = new Vector();
        
        //Add elements to Vector
        v.add("A");
        v.add("B");
        v.add("D");
        v.add("E");
        v.add("F");
        System.out.println("Vector contains : " + v);
        
        //Get Enumeration over Vector
        Enumeration e = v.elements();
        
        //Create ArrayList from Enumeration of Vector
        ArrayList aList = Collections.list(e);
        System.out.println("ArrayList Contains : " + aList);
    }

}
