package LatPraktikum5;

/**
 *
 * @author NURUL ARIFIN 19MI0016
 * 
 */
import java.util.Arrays;

public class TestMahasiswa {
    public static void main(String[] args){
        Mahasiswa dataMhs[] = {new Mahasiswa("05", "Cahya", 3.5), new Mahasiswa("04", "Rudi", 3.6),
            new Mahasiswa("01", "Endah",3.4), new Mahasiswa("03", "Rita", 3.1), new Mahasiswa("02", "Tika", 3.0)};
        System.out.println("\nSEBELUM DISORTING");
        System.out.println(Arrays.toString(dataMhs));
        Arrays.sort(dataMhs);
        System.out.println("\nSESUDAH DISORTING");
        System.out.println(Arrays.toString(dataMhs));
        }
    }
