package tp5.eje.pkg10;
import java.util.Random;
import java.util.Scanner;
public class TP5Eje10 {
    public static void main(String[] args) {
        int[][] temp = new int[5][7];
        lm(temp);
        mm(temp);
        ts(temp);
        ps(temp);
        tm(temp);
    }
    public static void lm(int[][] temp) {
        Random random = new Random();
        int dia=1;
        for (int i=0;i<5;i++) {
            for (int j=0;j<7;j++) {
                if (dia<=31) {
                    temp[i][j] = random.nextInt(32) + 7;
                    dia++;
                }
            }
        }
    }
    public static void mm(int[][] temp) {
        System.out.println("Temperaturas:\n");
        for (int i=0;i<5;i++) {
            for (int j=0;j<7;j++) {
                System.out.print("[" + temp[i][j] + "]");
            }
            System.out.println();
        }
    }
    public static void ts (int[][] temp) {
        for (int i=0;i<5;i++) {
            int mayor=temp[i][0];
            int menor=temp[i][0];
            int dm=0;
            int dme=0;
            for (int j=0;j<7;j++) {
                if (temp[i][j]>mayor) {
                    mayor=temp[i][j];
                    dm=j;
                }
                if (temp[i][j]<menor) {
                    menor=temp[i][j];
                    dme=j;
                }
            }
            System.out.println("Semana " + (i + 1) + " | Mayor: " + mayor + " dia " + dme + " | Menor: " + menor + " dia " + dme);
        }
    }
    public static void ps(int[][] temp) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese semana (1-5): ");
        int s = scanner.nextInt() - 1;
        int suma = 0;
        for (int j=0;j<7;j++) {
            suma +=temp[s][j];
        }
        double p=(double)suma/7;
        System.out.println("Promedio semana " + (s + 1) + ": " + p);
    }
    public static void tm (int[][] temp) {
        int mayor=temp[0][0];
        int sm=0;
        int dm=0;
        for (int i=0;i<5;i++) {
            for (int j=0;j<7;j++) {
                if (temp[i][j]>mayor) {
                    mayor = temp[i][j];
                    sm=i;
                    dm=j;
                }
            }
        }
        System.out.println("Mayor temperatura del mes es " + mayor + " de la semana " + (sm + 1) + "  del dia " + dm+ ".");
    }
}