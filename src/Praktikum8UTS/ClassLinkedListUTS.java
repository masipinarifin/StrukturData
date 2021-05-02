package Praktikum8UTS;

/**
 *
 * @NURUL ARIFIN 19MI0016 UTS PRAKTIKUM STRUKTUR DATA
 *
 */
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Iterator;

public class ClassLinkedListUTS {
    public static void main(String[] args) {
        //Nomor 1
        LinkedList<String> aList = new LinkedList<>();

        //tambah elemen pada objek aList
        aList.add("Merah");
        aList.add("Biru");
        aList.add("Hijau");

        //tampil elemen aList
        System.out.println("\nNomor 1");
        System.out.println("Isi LinkedList : " + aList);

        //Nomor 2
        aList.add("Hitam");
        aList.add("Biru");
        System.out.println("\nNomor 2");
        System.out.println("Isi LinkedList : " + aList);
        
        //hitung jumlah elemen "Biru"    
        int jml = 0;
        if (aList.indexOf("Biru") != -1) {
            jml = jml + 1;
        } else {
            jml = jml + 0;
        }
        
        if (aList.lastIndexOf("Biru") != -1) {
            jml = jml + 1;
        } else {
            jml = jml + 0;
        }
        System.out.println("Biru = " + jml);
        
        //tampil posisi Elemen "Biru"
        System.out.println("Posisi di Index " + aList.indexOf("Biru") + ", " + aList.lastIndexOf("Biru"));

        //Nomor 3
        aList.remove(1);
        System.out.println("\nNomor 3");
        System.out.println("Isi LinkedList : " + aList);

        //Nomor 4
        System.out.println("\nNomor 4");
        System.out.println("Index ke 1 : " + aList.get(1));
        System.out.println("Index ke 3 : " + aList.get(3));
        aList.remove(1);
        System.out.println("Isi LinkedList : " + aList);

        //Nomor 5
        System.out.println("\nNomor 5");
        aList.set(0, "Ungu");
        System.out.println("Isi LinkedList : " + aList);
        aList.add(1, "Coklat");
        System.out.println("Isi LinkedList : " + aList);

        //Nomor 6
        aList.addFirst("Kuning");
        aList.addFirst("Merah");
        System.out.println("\nNomor 6");
        System.out.println("Isi LinkedList : " + aList);

        //Nomor 7
        aList.addLast("Hijau");
        aList.addLast("Orange");
        System.out.println("\nNomor 7");
        System.out.println("Isi LinkedList : " + aList);

        //Nomor 8
        System.out.println("\nNomor 8");
        System.out.println("Elemen Pertama : " + aList.getFirst());
        System.out.println("Elemen Terakhir : " + aList.getLast());

        //Nomor 9
        System.out.println("\nNomor 9");
        aList.removeFirst();
        System.out.println("Isi LinkedList : " + aList);
        aList.removeLast();
        System.out.println("Isi LinkedList : " + aList);

        //Nomor 10
        System.out.println("\nNomor 10");
        Iterator itr = aList.descendingIterator();
        System.out.print("Baca Mundur LinkedList : [");
        while (itr.hasNext()) {
            System.out.print(itr.next());
            System.out.print(", ");
        }
        System.out.println("]");

        //Nomor 11
        System.out.println("\nNomor 11");
        Object[] ubahArray = aList.toArray();
        Arrays.sort(ubahArray);
        System.out.print("Diurutkan ascending : [");
        for (Object ubahArray1 : ubahArray) {
            System.out.print(ubahArray1);
            System.out.print(", ");
        }
        System.out.println("]");
    }
}