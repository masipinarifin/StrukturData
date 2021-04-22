package LatihanPraktikum6;

/**
 *
 * @author NURUL ARIFIN 19MI0016
 * 
 */
import java.util.Scanner;
public class KombinasiKarakter {
    public static void CharCombination(String a, int n, int m){
        if (n == 0){
            System.out.print(a + " ");
        } else {
            for (int i = 97; i < 97 + m; i++){
                CharCombination(a + (char) i, n-1, m);
            }
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Karakter : ");
        int n = input.nextInt();
        CharCombination("", n, n);
    }
}
