package Praktikum6;

/**
 *
 * @author NURUL ARIFIN 19MI0016
 * 
 */
import java.util.Scanner;

public class Prima {
    private static int ambilNilaiRekursif(int number, int index){
        if (index == 1){
            return 1;
        } else if (number % index == 0){
            return 1 + ambilNilaiRekursif(number, --index);
        } else {
            return 0 + ambilNilaiRekursif(number, --index);
        }
    }
    public static boolean cekBilanganPrima(int num){
        if (num > 1){
            return (ambilNilaiRekursif(num, num) == 2);
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan bilangannya : ");
        int num = input.nextInt();
        if (cekBilanganPrima(num)){
            System.out.println("Billangan Prima");
        } else {
            System.out.println("Bukan Bilangan Prima");
        }
    }
}
