/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectiondemoyt;

/**
 *
 * @author NURUL ARIFIN 19MI0016
 */

import java.util.ArrayList;

public class CollectionDemoYT {
    public static void main(String[] args){
        ArrayList<String> daftarNama = new ArrayList<String>();
        System.out.println(daftarNama);
        daftarNama.add("Fayruz");
        daftarNama.add("Rahma");
        System.out.println(daftarNama);
        
        ArrayList<String> daftarKu = new ArrayList<String>(daftarNama);
        System.out.println(daftarKu);
        daftarKu.add(1, "Mimi");
        System.out.println(daftarKu);
        
        ArrayList<String> dftrMobil = new ArrayList<String>();
        dftrMobil.add("Honda");
        dftrMobil.add("Toyota");
        
        daftarKu.addAll(dftrMobil);
        System.out.println(daftarKu);
        
        daftarKu.addAll(2, dftrMobil);
        System.out.println(daftarKu);
        
        System.out.println(daftarKu.get(5));
        daftarKu.set(5, "Suzuki");
        System.out.println(daftarKu);
        
        System.out.println(daftarKu.size());
        
        System.out.println(dftrMobil);
        dftrMobil.clear();
        System.out.println(dftrMobil);
        
        daftarKu.remove("Suzuki");
        System.out.println(daftarKu);
        daftarKu.remove(2);
        System.out.println(daftarKu);
        
        System.out.println(daftarKu.indexOf("Toyota"));
        System.out.println(daftarKu.lastIndexOf("Toyota"));
    }
}
