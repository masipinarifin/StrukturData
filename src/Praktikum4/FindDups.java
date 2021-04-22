package Praktikum4;

/**
 *
 * @author Nurul Arifin
 * 
 */
import java.util.*;
public class FindDups {
    public static void main(String[] args){
        Set<String> s = new HashSet<String>();
        for (String a : args)
            if (!s.add(a))
                System.out.println("Duplicate detected: " + a);
        
        System.out.println(s.size() + " distict words: " +s);
        
        
    }
    
}
