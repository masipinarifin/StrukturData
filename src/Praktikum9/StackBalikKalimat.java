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
        Stack stackBalik = new Stack();
        
        //menginput kalimat dari keyboard
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Kalimat : ");
        String kalimat = input.nextLine();
        
        //mengubah kalimat menjadi array charakter
        char[] toCharArray = kalimat.toCharArray();
        
        //menambah data stack
        for(Object chars : toCharArray){
            stack.push(chars);
        }
        
        //menambah data stackBalik dengan cara membalik urutan push
        for(int i=stack.size()-1; i >=0 ; i--){
            stackBalik.push(stack.get(i));
        }
        
        //mencetak kalimat terbalik dari input kalimat
        System.out.print("Hasil = ");
        for(int i=0; i <= stackBalik.size()-1; i++){
            System.out.print(stackBalik.get(i));
        }
        
        //mencetak kata yang diinput termasuk palindrom atau bukan
        System.out.println("");
        if(stack.equals(stackBalik)){
            System.out.println("Palindrom");
        }else{
            System.out.println("Bukan Palindrom");
        }
    }
}
