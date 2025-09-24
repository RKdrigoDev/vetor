import java.util.Random;

public class matrizTransposta {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] m = new int[2][3];
        int[][] M = new int[3][2];
        int aux, k;
        for (int l = 0; l < m.length; l++) {
            for (int c = 0; c < m[l].length; c++) {
                m[l][c] = r.nextInt(1, 10);
                M[c][l]=m[l][c];
                System.out.print(m[l][c] + "\t");

            }
            System.out.println();
        }
        System.out.println();
        for (int l = 0; l < M.length; l++) {
            for (int c = 0; c < M[l].length; c++){

                System.out.print(M[l][c] + "\t");


            }
            System.out.println();
        }
    }
}
