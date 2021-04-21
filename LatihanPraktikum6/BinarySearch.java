package LatihanPraktikum6;

/**
 *
 * @author NURUL ARIFIN 19MI0016
 * 
 */
public class BinarySearch {
    public static int Cari_Data(int[] x, int y, int z){
        if (z < 0){
            return -1;
        } else if (x[z] == y){
            return z;
        } else {
            return Cari_Data(x, y, z-1);
        }
    }
    public static int Search(int[] x, int y){
        return Cari_Data(x, y, x.length - 1);
    }
    public static void main(String[] args){
        int[] data = {23, 11, 36, 37, 3, 20, 24, 13, 14};
        System.out.println("### MENCARI INDEKS PADA DATA (BINARYSEARCH)###");
        System.out.print("Data = ");
        for(int i = 0; i < data.length; i++){
            System.out.print(" " + data[i]);
        }
        System.out.println("\nDATA YANG DICARI : 11");
        int n = Search(data, 11);
        if(n >= 0){
            System.out.println("Ditemukan pada indeks ke " + n);
        } else {
            System.out.println("Tidak ditemukan");
        }
    }
}
