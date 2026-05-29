package tp5.eje.pkg11;
import java.util.Scanner;
public class TP5Eje11 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        System.out.println("1 = Sumar");
        System.out.println("2 = Restar");
        System.out.println("3 = Multiplicar");
        int x = scanner.nextInt();
        System.out.print("Ingrese size N de la matriz NxN: ");
        int n = scanner.nextInt();
        int[][] m1 = new int[n][n];
        int[][] m2 = new int[n][n];
        int[][] resultado = new int[n][n];
        System.out.println("\nMatriz 1");
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print("Ingrese valor [" + i + "][" + j + "]: ");
                m1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nMatriz 2");
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print("Ingrese valor [" + i + "][" + j + "]: ");
                m2[i][j] = scanner.nextInt();
            }
        }
        switch (x) {
            case 1:
                for (int i=0;i<n;i++){
                    for (int j=0;j<n;j++){
                        resultado[i][j] = m1[i][j] + m2[i][j];
                    }
                }
                break;
            case 2:
                for (int i=0;i<n;i++){
                    for (int j=0;j<n;j++){
                        resultado[i][j] = m1[i][j] - m2[i][j];
                    }
                }
                break;
            case 3:
                for (int i=0;i<n;i++){
                    for (int j=0;j<n;j++){
                        resultado[i][j] = m1[i][j] * m2[i][j];
                    }
                }
                break;

            default:
                System.out.println("Opcion invalida");
        }
        System.out.println("Resultado:");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("[" + resultado[i][j] + "]");
            }
            System.out.println();
        }
    }
}