package tp5.ej.pkg4;
import java.util.Scanner;
public class TP5Ej4 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de nombres que tendra la matriz.");
        int fi = 0;
        do{
            fi = n.nextInt();
        }while(fi < 0);
        String [][] matriz = new String [fi][2];
        n.nextLine();
        for(int i = 0; i < fi; i++ ){
            System.out.println("Ingrese el nombre del uruario "+(i+1)+".");
            matriz[i][0]= n.nextLine();
        }
        
        for(int j = 0; j < fi; j++ ){
            System.out.println("Ingrese el numero del usuario "+(j+1)+".");
            matriz[j][1]= n.nextLine();
        }
        for(int filas = 0; filas < fi; filas++ ){
            System.out.println("El usuario "+(filas+1)+" es "+matriz[filas][0]+" y se le asigno el numero "+matriz[filas][1]);
        }
    }
}