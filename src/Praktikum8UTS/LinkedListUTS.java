package Praktikum8UTS;

/**
 *
 * @NURUL ARIFIN 19MI0016 UTS PRAKTIKUM STRUKTUR DATA
 *
 */
import java.util.LinkedList;

public class LinkedListUTS {

    public static void main(String[] args) {
        //1. Buatlah sebuah object kosong LinkedList dengan tipe String, beri nama dengan aList
        LinkedList<String> aList = new LinkedList<String>();

        //menambahkan elemen pada objek aList
        aList.add("Merah");
        aList.add("Biru");
        aList.add("Hijau");

        //menampilkan elemen aList
        System.out.println("Ouput Nomor 1");
        System.out.println("LinkedList berisi : " + aList);

        //2. Tambahkan elemen lagi Hitam dan Biru, hitung jumlah elemen ”Biru” dan tampilkan posisi dari elemen ”Biru” pada aList
        aList.addLast("Hitam");
        aList.addLast("Biru");

        System.out.println("\nOuput Nomor 2");
        System.out.println("LinkedList berisi : " + aList);
        System.out.println("Biru = ");
        int index = aList.indexOf("Biru");
        if (index != -1) {
            System.out.print("Posisi di Index " + index + ", ");
        } else {
            System.out.print("");
        }

        index = aList.lastIndexOf("Biru");
        if (index != -1) {
            System.out.print(index + "\n");
        } else {
            System.out.print("");
        }
    }
}
