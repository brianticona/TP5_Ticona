package tp5.ej.pkg8;
import java.util.Scanner;
public class TP5Ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String p3 = scanner.nextLine();
        String[] p2 = p3.split(" ");
        String[][] p1 = new String[p2.length][2];
        for (int i = 0; i < p2.length; i++) {
            p1[i][0] = p2[i];
            p1[i][1] = String.valueOf(p2[i].length());
        }
        for (int i = 0; i < p2.length; i++) {
            System.out.println(p1[i][0] + " - " + p1[i][1]);
        }
    }
}