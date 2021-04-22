package Praktikum6;

/**
 *
 * @author NURUL ARIFIN 19MI0016
 * 
 */
public class Fibonacci {
    public static int fibbon(int x){
        if(x <= 0 || x <= 1){
           return x;
        } else {
            return fibbon(x-1) + fibbon(x-2);
        }
    }
public static void main(String[] args){
    int n = 10;
    for (int i=0; i < n; i++){
        System.out.println("f" + i + "=" + fibbon(i));
    }
}
}
