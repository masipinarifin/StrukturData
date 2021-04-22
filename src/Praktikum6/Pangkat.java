package Praktikum6;

/**
 *
 * @author NURUL ARIFIN
 * 
 */
import java.util.Scanner;
public class Pangkat {
    public static int pangkatRekursif(int x, int y){
        if (y==0){
            return 1;
        } else {
            return x * pangkatRekursif(x, y-1);
        }
    }
    public static void main(String[] args){
        System.out.println("Menghitung bilangan x pangkat y");
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan bilangan x : ");
        int x = input.nextInt();
        System.out.print("Masukan bilangan y : ");
        int y = input.nextInt();
        System.out.println(x + " dipangkatkan " + y + " = " + pangkatRekursif(x, y));
    }
}
