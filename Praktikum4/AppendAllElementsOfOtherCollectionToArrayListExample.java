package Praktikum4;

/**
 *
 * @author NURUL ARIFIN 19MI0016
 * 
 */
import java.util.ArrayList;
import java.util.Vector;

public class AppendAllElementsOfOtherCollectionToArrayListExample {
    public static void main(String[] args){
        //create an ArrayList object
        ArrayList arrayList = new ArrayList();
        
        //Add elements to ArrayList
        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("3");
        
        //Create a Vector object
        Vector v = new Vector();
        v.add("4");
        v.add("5");
        
        //append all elements of Vector to ArrayList
        arrayList.addAll(v);
        
        //display elements of ArrayList
        System.out.println("After appending all elements of Vector, ArrayList contains..");
        
        for(int i=0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
            
    }

}
