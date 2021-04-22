package Praktikum5;

/**
 *
 * @author NURUL ARIFIN
 * 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayListInDescendingOrderExample {
    public static void main(String[] args){
        //Create an ArrayList object
        ArrayList arrayList = new ArrayList();
        
        //Add elements to ArrayList arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        Comparator comparator = Collections.reverseOrder();
        System.out.println("Before sorting ArrayList in descending order : " + arrayList);
        Collections.sort(arrayList, comparator);
        System.out.println("After sorting ArrayList in descending order : " + arrayList);
    }

}
