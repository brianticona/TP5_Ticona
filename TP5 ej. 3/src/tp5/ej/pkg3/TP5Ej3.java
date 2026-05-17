package tp5.ej.pkg3;
import java.util.Scanner;
public class TP5Ej3 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas que tendra la matriz.");
        int fi = 0;
        do{
            fi = n.nextInt();
        }while(fi < 0);
        System.out.println("Ingrese la cantidad de columnas que tendra la matriz.");
        int co = 0;
        do{
            co = n.nextInt();
        }while(co < 0);
        int [][] matriz = new int [fi][co];
        for(int i = 0; i < fi; i++ ){
            for(int j = 0; j < co; j++){
                System.out.println("Ingrese el numero de la fila "+(i+1)+" columna "+(j+1)+".");
                 matriz[i][j]= n.nextInt();
            }
        }
        for(int filas = 0; filas < fi; filas++ ){
            for(int columnas = 0; columnas < co; columnas++){
                System.out.println("Fila = " + (filas+1) + " columna = " + (columnas+1)+".");
                System.out.println("El valor de esta posicion es "+matriz[filas][columnas]+".");
            }
        }
    }
}