package Praktikum5;

/**
 *
 * @author NURUL ARIFIN 19MI0016
 * 
 */
import java.util.Comparator;

public class NamaComparator implements Comparator{
    public int compare(Object o1, Object o2){
        Mahasiswa m1 = (Mahasiswa) o1;
        Mahasiswa m2 = (Mahasiswa) o2;
        return m1.getNama().compareTo(m2.getNama());
    }
}
