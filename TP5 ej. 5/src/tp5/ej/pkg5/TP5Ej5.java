package tp5.ej.pkg5;
import java.util.Scanner;
public class TP5Ej5 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String[][]mat= new String[3][3];
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (j % 2 == 0) {
                    System.out.println("Ingrese un nombre de la posicion " + (i+1) + " " +(j+1) + ": ");
                    mat[i][j] = n.nextLine();
                }
                else {
                    System.out.println("Ingrese un numero de la posicion " + (i+1) + " " + (j+1) + ": ");
                    mat[i][j] = n.nextLine();
                }
            }
        }
        System.out.println("Datos ingresados.");
        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                if (j % 2 == 0) {
                    System.out.println("Nombre ingresado de la posicion " + (i+1) + " " +(j+1) + ": ");
                    System.out.println(mat[i][j]);
                }
                else {
                    System.out.println("Numero ingresado de la posicion " + (i+1) + " " + (j+1) + ": ");
                    System.out.println(mat[i][j]);
                }
            }
        }
    }
}