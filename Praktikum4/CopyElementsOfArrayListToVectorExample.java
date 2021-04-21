package Praktikum4;

/**
 *
 * @author Nurul Arifin 19MI0016
 * 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class CopyElementsOfArrayListToVectorExample {
    public static void main(String[] args){
        //Create ArrayList Object
        ArrayList arrayList = new ArrayList();
        
        //Add element to ArrayList
        arrayList.add("1");
        arrayList.add("4");
        arrayList.add("2");
        arrayList.add("5");
        arrayList.add("3");
        
        //Create a Vector Object
        Vector v = new Vector();
        
        //Add elements to Vector
        v.add("A");
        v.add("B");
        v.add("D");
        v.add("E");
        v.add("F");
        v.add("G");
        v.add("H");
        
        System.out.println("Before copy, Vector contaiins : " + v);
        
        //copy all elements of ArrayList to Vector using copy method of Collections class
        Collections.copy(v, arrayList);
        
        System.out.println("After copy, Vector contaiins : " + v);
    }

}
