package Praktikum4;

/**
 *
 * @author Nurul Arifin 19MI0016
 * 
 */
import java.util.*;
class IteratorDemo {
    public static void main(String[] args){
        //Create an array list
        ArrayList a1 = new ArrayList();
        //add elements to the array list
        a1.add("C");
        a1.add("A");
        a1.add("E");
        a1.add("B");
        a1.add("D");
        a1.add("F");
        //Use iterator to display contents of   a1
        System.out.println("Original contents of a1 : ");
        Iterator itr = a1.iterator();
        while (itr.hasNext()){
            
            Object element = itr.next();
            System.out.print(element + " ");
            
        }
        System.out.println();
        //modify object being ilerated
        ListIterator litr = a1.listIterator();
        while (litr.hasNext()){
            
            Object element = litr.next();
            litr.set(element + "+");
            
        }
        System.out.print("Modified content of a1 : ");
        itr =   a1.iterator();
        while (itr.hasNext()){
            
            Object element = itr.next();
            System.out.print(element + " ");
            
        }
        System.out.println();
        //now display the list backwards
        System.out.print("Modified list backwards : ");
        while (litr.hasPrevious()){
            
            Object element = litr.previous();
            System.out.print(element + " ");
            
        }
        System.out.println();
    }
}
