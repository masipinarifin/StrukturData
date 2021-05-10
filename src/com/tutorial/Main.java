package com.tutorial;

/**
 *
 * @author nurularifin 19MI0016
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] arrayAngka1 = {1,2,3,4,5};
        
        //mengubah array menjadi string
        System.out.println("\nMengubah Array menjadi string\n ============");
        printArray(arrayAngka1);
        
         //mengcopy array
        System.out.println("\nMengcopi Array\n ============");
        int[] arrayAngka2 = new int[5];
        printArray(arrayAngka1);
        printArray(arrayAngka2);
        
        System.out.println("\nMengkopi dengan loop");
        for(int i=0; i < arrayAngka1.length; i++){
            arrayAngka2[i] = arrayAngka1[i];
        }
        
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka2);
        System.out.println(arrayAngka2);
        
        System.out.println("\nMengkopi dengan copyOf");
        int[] arrayAngka3 = Arrays.copyOf(arrayAngka1, 3);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka3);
        System.out.println(arrayAngka3);
        
        System.out.println("\nMengkopi dengan copyOfRange");
        int[] arrayAngka4 = Arrays.copyOfRange(arrayAngka1, 2, 5);
        printArray(arrayAngka1);
        System.out.println(arrayAngka1);
        printArray(arrayAngka4);
        System.out.println(arrayAngka4);
        
        //Fill array
        System.out.println("\nFill Array \n ============");
        int[] arrayAngka5 = new int[10];
        printArray(arrayAngka5);
        Arrays.fill(arrayAngka5, 5);
        printArray(arrayAngka5);
        
        //Komparasi Array
        System.out.println("\nKomparasi Array \n ============");
        int[] arrayAngka6 = {1,2,3,4,5};
        int[] arrayAngka7 = {1,2,3,4,5};
        
        System.out.println("membandingkan 2 buah array");
        System.out.println(Arrays.equals(arrayAngka6, arrayAngka7));
        
        if(Arrays.equals(arrayAngka6, arrayAngka7)){
            System.out.println("Array ini sama");
        } else{
            System.out.println("Array ini beda");
        }
        
       //System.out.println(Arrays.compare(arrayAngka6, arrayAngka7));
        
        
        
    }
    
    private static void  printArray(int[] dataArray){
        System.out.println("Array = " + Arrays.toString(dataArray));
    }
}
