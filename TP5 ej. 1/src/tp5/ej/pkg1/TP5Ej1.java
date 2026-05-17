package tp5.ej.pkg1;
import java.util.Scanner;
public class TP5Ej1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int [][] matriz = new int [2][2];
        for(int i = 0; i < 2; i++ ){
            for(int j = 0; j < 2; j++){
                System.out.println("Ingrese el numero de la fila "+(i+1)+" columna "+(j+1)+".");
                 matriz[i][j]= n.nextInt();
            }
        }
        for(int filas = 0; filas < 2; filas++ ){
            for(int columnas = 0; columnas < 2; columnas++){
                System.out.println("Fila = " + (filas+1) + " columna = " + (columnas+1)+".");
                System.out.println("El valor de esta posicion es "+matriz[filas][columnas]+".");
            }
        }
    }
}