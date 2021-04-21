package LatihanPraktikum6;

/**
 *
 * @author NURUL ARIFIN 19MI0016
 * 
 */
public class Pascal {
    public static int Bilangan_Pascal(int x, int y){
        if (y == 0 || y == x){
            return 1;
        } else {
            return Bilangan_Pascal(x - 1, y - 1) + Bilangan_Pascal(x - 1, y);
        }
    }
    public static void main(String[] args){
        int baris = 6;
        int spasi = baris;
        
        System.out.println("Segitiga Pascal");
        for (int i = 0; i < baris; i++){
            System.out.print("F" + (i + 1));
            for (int j = 0; j <= spasi; j++){
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print(Bilangan_Pascal(i, j) + " ");
            }
            System.out.println("");
            spasi--;
        }
    }
}
