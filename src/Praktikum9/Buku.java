package Praktikum9;

/**
 *
 * @NURUL ARIFIN
 * 19MI0016
 * 
 */
import java.util.Scanner;
public class Buku {
    int id, tahun;
    String judul;

    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setTahun(int tahun){
        this.tahun = tahun;
    }
    
    public int getTahun(){
        return tahun;
    }
    
    public void setJudul(String judul){
        this.judul = judul;
    }
    
    public String getJudul(){
        return judul;
    }
}
