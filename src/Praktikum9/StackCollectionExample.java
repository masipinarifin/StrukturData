package Praktikum9;

/**
 *
 * @NURUL ARIFIN 19MI0016
 *
 */
import java.util.Iterator;
import java.util.Stack;

public class StackCollectionExample {

    public static void main(String[] args) {
        Stack<String> sk = new Stack<String>();

        sk.push("a");
        sk.push("c");
        sk.push("e");
        sk.push("d");

        Iterator it = sk.iterator();

        System.out.println("Size before pop () : " + sk.size());

        while (it.hasNext()) {
            String iValue = (String) it.next();
            System.out.println("Iterator value : " + iValue);
        }
        //get and remove last element from stack
        String value = (String)sk.pop();
        System.out.println("value : " + value);
        System.out.println("Size after pop() : " + sk.size());
    }

}
