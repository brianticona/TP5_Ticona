package tp5.ej.pkg6;
import java.util.Scanner;
public class TP5Ej6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] p1 = new String[4][3];
        p1[0][0]="Nombre";
        p1[0][1]="Edad";
        p1[0][2]="Sueldo";
        for (int i=1;i<4;i++) {
            for (int j=0;j<3;j++) {
                if (j == 0){
                    System.out.println("Ingrese el nombre de la posicion " + i + " " + j + ": ");
                    p1[i][j] = scanner.nextLine();
                }
                else if(j == 1) {
                    System.out.println("Ingrese la edad de la posicion " + i + " " + j + ": ");
                    p1[i][j] = scanner.nextLine();
                }
                else{
                    System.out.println("Ingrese el sueldo de la posicion " + i + " " + j + ": ");
                    p1[i][j] = scanner.nextLine();
                }
            }
        }
        for (int i=1;i<4;i++) {
            System.out.println("El empleado " + p1[i][0]+" tiene "+ p1[i][1]+" años y su salario es "+p1[i][2]+".");
        }
    }
}