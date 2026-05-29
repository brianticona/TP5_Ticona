package tp5.ej.pkg9;
import java.util.Scanner;
public class TP5Ej9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de filas que se desea para la matriz: ");
        int filas=scanner.nextInt();
        int[][]p1 = new int[filas][3];
        for (int i=0;i<filas;i++){
            System.out.print("Ingrese primer numero de la fila " + i + ": ");
            p1[i][0] = scanner.nextInt();
            System.out.print("Ingrese segundo numero de lafila " + i + ": ");
            p1[i][1] = scanner.nextInt();
            p1[i][2] = p1[i][0] + p1[i][1];
        }
        System.out.println("Resultados:");
        for (int i=0;i<filas;i++) {
            for (int j=0;j<3;j++) {
                System.out.print("[" + p1[i][j] + "]");
            }
        }
    }
}