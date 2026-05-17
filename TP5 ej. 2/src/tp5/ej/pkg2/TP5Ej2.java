package tp5.ej.pkg2;
public class TP5Ej2 {
    public static void main(String[] args) {
        int[][]matriz=new int [3][3];
        int i = 0;
        matriz[0][0]= 1 ;
        matriz[0][1]= 5 ;
        matriz[0][2]= 4 ;
        matriz[1][0]= 2 ;
        matriz[1][1]= 4 ;
        matriz[1][2]= 5 ;
        matriz[2][0]= 1 ;
        matriz[2][1]= 2 ;
        matriz[2][2]= 3 ;
        while(i < 3){
            int j = 0;
            while(j < 3){
                System.out.println("fila: "+(i+1)+" columna: "+(j+1)+".");
                System.out.println(matriz[i][j]);
                j++;
            }
            i++;
        }
    }
}