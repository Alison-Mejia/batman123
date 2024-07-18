package laboratorio2.bloque3;

public class Laboratorio2Bloque3 {

    public static void main(String[] args) {

        int matriz[][] = {{5, 7, 9}, {4, 2, 1}, {1, 1, 1}};
        int arr[][] = new int[3][3];
        int columnas = 2;
        int filas = 2;
        for (int k = 0; k < matriz.length; k++) {
            for (int m = 0; m < matriz[0].length; m++) {
                arr[filas][columnas] = matriz[k][m];
                columnas--;

            }
            filas--;
            columnas = 2;

        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(arr [i][j] + "|");
            }
            System.out.println("");
        }

    }

}
