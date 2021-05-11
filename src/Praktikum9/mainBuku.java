package Praktikum9;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author PC
 */
public class mainBuku {

    static Stack<Buku> sa = new Stack<Buku>();
    static Scanner in = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);

    private static void Menu() {
        //menu
        System.out.println("Pilih Menu :");
        System.out.println("1. push");
        System.out.println("2. pop");
        System.out.println("3. view");
        System.out.println("4. exit");
    }

    public static void Input() {
        Buku data = new Buku();
        System.out.println("Pushing Data");
        System.out.println("----------------------------------");
        System.out.print("Masukan id buku       : ");
        data.setId(in.nextInt());
        System.out.print("Masukan judul         : ");
        data.setJudul(str.nextLine());
        System.out.print("Masukan tahun terbit  : ");
        data.setTahun(in.nextInt());

        sa.push(data);
    }

    public static void View() {
        for (int i = sa.size()-1; i >= 0  ; i--) {
            System.out.println("id buku         : " + sa.get(i).getId());
            System.out.println("judul           : " + sa.get(i).getJudul());
            System.out.println("Tahun Terbit    : " + sa.get(i).getTahun());
            System.out.println("----------------------------------");
        }
    }
    public static void Peek() {
            System.out.println("Popping Data....");
            System.out.println("----------------------------------");
            System.out.println("id buku         : " + sa.peek().getId());
            System.out.println("judul           : " + sa.peek().getJudul());
            System.out.println("Tahun Terbit    : " + sa.peek().getTahun());
            System.out.println("----------------------------------");
    }

    public static void main(String[] args) {

        int menu = 0;
        while (menu != 4) {
            Menu();
            System.out.print("    : ");
            menu = in.nextInt();
            switch (menu) {
                case 1:
                    Input();
                    break;
                case 2:
                    Peek();
                    sa.pop();
                    break;
                case 3:
                    View();
                    break;
            }
            System.out.println("");

        }

    }
}
