package Praktikum9;

/**
 *
 * @Nurul Arifin 19MI0016
 * 
 */
import java.util.Stack;
public class StackExampleVideo {
    public static void main(String[] args)
    {
        Stack<Integer> stk = new Stack<>();
        Stack<String> stks = new Stack<>();
        
        boolean hasil = stk.empty();
        System.out.println("Apakah stack kosong? " + hasil);
        
        stk.push(6);
        stk.push(2);
        
        System.out.println("Elemen dalam stack " + stk);
        
        stk.push(8);
        System.out.println("Elemen dalam stack " + stk);
        
        stk.pop();
        System.out.println("Elemen dalam stack " + stk);
        
        System.out.println("Ini item paling atas : " + stk.peek());
        
        boolean hasils = stks.empty();
        System.out.println("Apakah stack (string) kosong? " + hasil);
        
        stks.push("Pisang");
        stks.push("Apel");
        
        System.out.println("Elemen dalam stack (string) " + stks);
         
        stks.push("Anggur");
        System.out.println("Elemen dalam stack (string) " + stks);
        
        stks.pop();
        System.out.println("Elemen dalam stack (string) " + stks);
        
        System.out.println("Ini item paling atas : " + stks.peek());
        
        System.out.println("Di manakah lokasinya? " + stks.search("Pisang"));
    }
    
}
