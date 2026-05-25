package tp5.ej.pkg7;
import java.util.Scanner;
public class TP5Ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas que tendra la matriz.");
        int filas = scanner.nextInt();
        System.out.println("Ingrese la cantidad de columnas que tendra la matriz.");
        int columnas = scanner.nextInt();
        int [][]p1= new int[filas][columnas];
        int si = 0;
        int ci = 0;
        for (int i=0; i<filas; i++) {
            for (int j=0; j<columnas; j++) {
                System.out.print("Ingrese un numero en la posicion " + i + " " + j + " de la matriz: ");
                    p1[i][j] = scanner.nextInt();
                if (j % 2 != 0) {
                    si = si + p1[i][j];
                    ci++;
                }
            }
        }
        System.out.println("Promedio de los valores en las posiciones impares :  " + si/ci);
    }
}