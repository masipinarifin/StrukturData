package Praktikum8UTS;

/**
 *
 * @NURUL ARIFIN 19MI0016 UTS PRAKTIKUM STRUKTUR DATA
 *
 */
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListUTS {

    //Method menampilkan isi LinkedList
    public static void PrintList(LinkedList list) {
        System.out.println("LinkedList berisi : " + list);
    }

    //Method menampilkan nomor soal
    public static void PrintNomor(int a) {
        System.out.println("\nOuput Nomor " + a);
    }
    
    //Method menampilkan index ke-
    //Nomor 4
    public static void TampilkanElemenByIndex(LinkedList list, int a){
        if(a > -1){
            if(a < list.size()){
                System.out.println("Index ke " + a + " : " + list.get(a));
            }else{
                System.out.println("Index ke " + a + " : Tidak ditemukan");
            }
        } else{
            System.out.println("Index ke " + a + " : Tidak ditemukan");
        }
    }
    
    //Method baca mundur linkedlist
    //Nomor 10
    public static void BacaMundur(LinkedList list){
        Iterator itr = list.descendingIterator();
        System.out.print("Pembacaan Mundur : [");
        while (itr.hasNext()) {
            System.out.print(itr.next());
            if (itr.hasNext()) {
                System.out.print(", ");
            } else {
                System.out.print("]");
            }
        }
    }
    
    //Method mengurutkan LinkedList secara Ascending
    //Nomor 11
    public static void UrutkanAscending(LinkedList list){
        Object[] objArray = list.toArray();
        Arrays.sort(objArray);
        System.out.print("Setelah diurutkan ascending : [");
        for (int i = 0; i < objArray.length; i++) {
            System.out.print(objArray[i]);
            if (i < objArray.length - 1) {
                System.out.print(", ");
            } else {
                System.out.print("]");
            }
        }
    }
    
    public static void main(String[] args) {
        //1. Buatlah sebuah object kosong LinkedList dengan tipe String, beri nama dengan aList
        LinkedList<String> aList = new LinkedList<>();

        //menambahkan elemen pada objek aList
        aList.add("Merah");
        aList.add("Biru");
        aList.add("Hijau");

        //menampilkan elemen aList
        PrintNomor(1);
        PrintList(aList);

        //2. Tambahkan elemen lagi Hitam dan Biru, hitung jumlah elemen ”Biru” dan tampilkan posisi dari elemen ”Biru” pada aList
        aList.add("Hitam");
        aList.add("Biru");
        PrintNomor(2);
        PrintList(aList);
        
        //menghitung jumlah biru    
        int index1 = aList.indexOf("Biru");
        int count = 0;
        if (index1 != -1) {
            count = count + 1;
        } else {
            count = count + 0;
        }

        index1 = aList.lastIndexOf("Biru");
        if (index1 != -1) {
            count = count + 1;
        } else {
            count = count + 0;
        }
        System.out.println("Biru = " + count);
        
        //mencari dan menampilkan posisi Elemen "Biru"
        int index = aList.indexOf("Biru");
        int indexFirst;
        int indexLast;
        if (index != -1) {
            indexFirst = index;
        } else {
            indexFirst = 0;
        }

        index = aList.lastIndexOf("Biru");
        if (index != -1) {
            indexLast = index;
        } else {
            indexLast = 0;
        }
        System.out.println("Posisi di Index " + indexFirst + ", " + indexLast);

        //3. Hapus warna biru pertama
        aList.remove(1);
        PrintNomor(3);
        PrintList(aList);

        //4. Tampilkan elemen pada index ke 1 dan 3, selanjutnya hapus index ke 1.
        PrintNomor(4);
        TampilkanElemenByIndex(aList, 1);
        TampilkanElemenByIndex(aList, 3);
        aList.remove(1);
        PrintList(aList);

        //5. Ubah pada index ke-0 dari merah menjadi ungu, selanjutnya tambahkan elemen baru pada index ke-1 dengan Coklat.
        PrintNomor(5);
        aList.set(0, "Ungu");
        PrintList(aList);
        aList.add(1, "Coklat");
        PrintList(aList);

        //6. Gunakan method addFirst() untuk menambahkan elemen di awal aList, elemen yang ditambahkan adalah Kuning, ulangi lagi dengan menambahkan Merah
        aList.push("Kuning");
        aList.push("Merah");
        PrintNomor(6);
        PrintList(aList);

        //7. Gunakan method addLast() untuk menambahkan elemen di akhir aList, elemen yang ditambahkan Hijau, ulangi lagi dengan menambahkan Oranye.
        aList.addLast("Hijau");
        aList.addLast("Orange");
        PrintNomor(7);
        PrintList(aList);

        //8. Tampilkan elemen yang pertama dan terakhir.
        PrintNomor(8);
        System.out.println("Elemen Pertama : " + aList.getFirst());
        System.out.println("Elemen Terakhir : " + aList.getLast());

        //9. Selanjutnya hapus elemen yang pertama, dan elemen yang terakhir.
        PrintNomor(9);
        aList.pop();
        PrintList(aList);
        aList.removeLast();
        PrintList(aList);

        //10. Menggunakan iterasi, lakukan pembacaan mundur.
        PrintNomor(10);
        BacaMundur(aList);
        System.out.println();

        //11. Urutkan elemen yang terdapat di aList secara asscending.
        PrintNomor(11);
        UrutkanAscending(aList);
        System.out.println();
    }
}