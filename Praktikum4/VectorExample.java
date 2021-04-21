package Praktikum4;

/**
 *
 * @author Nurul Arifin 19MI0016
 * 
 */

import java.util.Vector;
public class VectorExample {
    
    public static void main(String[] args){
        Vector<String> vc = new Vector<String>();
        
        //<E> Element type of vector e.g. String, Integer, Object, ....
        //add vector elements
        vc.add("Vector object 1");
        vc.add("Vector object 2");
        vc.add("Vector object 3");
        vc.add("Vector object 4");
        vc.add("Vector object 5");
        
        //add vector element at index
        vc.add(3, "Elment at fix position");
        
        //vc.size() inform number of elements in Vector
        System.out.println("Vector Size : " + vc.size());
        
        //get element of Vector
        for (int i=0; i< vc.size();i++)
        {
            System.out.println("Vector Element "+i+" : " + vc.get(i));
        }
    }
    
}
