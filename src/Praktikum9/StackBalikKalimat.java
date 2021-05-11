package Praktikum9;

/**
 *
 * @NURUL ARIFIN
 * 19MI0016
 * 
 */
import java.util.Scanner;
import java.util.Stack;

public class StackBalikKalimat {
    public static void main(String[] args) {
        //membuat objek stack kosong
        Stack stack = new Stack();
        
        //menginput kalimat dari keyboard
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Kalimat : ");
        String kalimat = input.nextLine();
        
        //menambah data pada stack
        for(Object chars : kalimat.toCharArray()){
            stack.push(chars);
        }
        
        String balikKalimat = "";
        
        //mencetak kalimat terbalik dari input kalimat
        System.out.print("Hasil = ");
        while(!stack.isEmpty()){
            balikKalimat = balikKalimat+stack.pop();
        }
        System.out.print(balikKalimat);
        
        //mengecek dan mencetak kata yang diinput termasuk palindrom atau bukan
        System.out.println("");
        if(kalimat.equals(balikKalimat)){
            System.out.println("Palindrom");
        }else{
            System.out.println("Bukan Palindrom");
        }
    }
}
