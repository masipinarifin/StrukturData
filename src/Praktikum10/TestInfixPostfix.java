package Praktikum10;

/**
 *
 * @NURUL ARIFIN 19MI0016
 */
import java.util.Scanner;
public class TestInfixPostfix {
    public static void main(String[] args) {
        InfixToPostfix itp = new InfixToPostfix();
        String infix;
        Scanner keyIn = new Scanner(System.in);
        System.out.print("Infix Expression : ");
        infix = keyIn.nextLine();
        itp.setInfixExp(infix);
        System.out.println("Postfix Expression : " + itp.toPostfix());
    }
}
