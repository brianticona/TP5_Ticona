package tp5.eje.pkg10;
import java.util.Random;
import java.util.Scanner;
public class TP5Eje10 {
    static int[][] m = new int[5][7];
    public static void lm() {
        Random r = new Random();
        int dia = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                if (dia <= 31) {
                    m[i][j] = r.nextInt(32) + 7;
                    dia++;
                } else {
                    m[i][j] = 0;
                }
            }
        }
    }
    public static void ts(int semana) {
        String[] dias = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int max = m[semana][0];
        int min = m[semana][0];
        int diaMax = 0;
        int diaMin = 0;
        for (int i = 0; i < 7; i++) {
            if (m[semana][i] > max) {
                max = m[semana][i];
                diaMax = i;
            }
            if (m[semana][i] < min && m[semana][i] != 0) {
                min = m[semana][i];
                diaMin = i;
            }
        }
        System.out.println("Temperatura mas alta fue: " + max + "°C - " + dias[diaMax]);
        System.out.println("Temperatura mas baja fue: " + min + "°C - " + dias[diaMin]);
    }
    public static double ps(int semana) {
        int suma = 0;
        int cantidad = 0;
        for (int i = 0; i < 7; i++) {
            if (matriz[semana][i] != 0) {
                suma += matriz[semana][i];
                cantidad++;
            }
        }
        return (double) suma / cantidad;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        lm();
        System.out.println("Temperaturas del mes:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("\nIngrese una semana (1 a 5): ");
        int semana = sc.nextInt() - 1;
        ts(semana);
        System.out.println("Promedio: " + ps(semana) + "°C");
    }
}