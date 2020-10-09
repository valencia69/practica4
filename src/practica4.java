import java.util.Scanner;
public class practica4 {

    int[][] valor = new int[5][15];
    Scanner scanner;

    public practica4() {
        scanner = new Scanner(System.in);
    }

    public void ejecutar() {

        for (int i = 0; i < valor.length; i++) {
            for (int j = 0; j < valor[i].length; j++) {

                if (j == 0) {

                    valor[i][j] = 1;

                } else if (i == 0) {

                    valor[i][j] = 1;

                } else if (i == valor.length - 1) {

                    valor[i][j] = 1;

                } else if (j == valor[i].length - 1) {

                    valor[i][j] = 1;

                } else {
                    valor[i][j] = 0;
                }
            }
        }
        int i = 0;
        while (i < valor.length) {

            for (int j = 0; j < valor[i].length; j++) {
                System.out.print(valor[i][j]);

            }
            System.out.println();
            i++;
        }
    }
}
