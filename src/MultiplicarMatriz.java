import java.util.Random;

public class MultiplicarMatriz {
    public static void main(String[] args) {
        Random r = new Random();
        int aux=0;
        int[][] A = new int[3][2];
        int[][] B = new int[2][3];
        int[][] C = new int[3][3];
        for (int l = 0; l < A.length; l++) {
            for (int c = 0; c < A[l].length; c++) {
                A[l][c] = r.nextInt(1, 5);
                System.out.print("\t" + A[l][c]);
            }
            System.out.println();
        }
        System.out.println();
        for (int l = 0; l < B.length; l++) {
            for (int c = 0; c < B[l].length; c++) {
                B[l][c] = r.nextInt(1, 5);
                System.out.print("\t" + B[l][c]);
            }
            System.out.println();
        }
            for (int l=0;l< C.length;l++){
                for (int c=0; c< C.length;c++){
                    aux=0;
                    for (int k=0;k<B.length;k++){
                        aux+=A[l][k]*B[k][c];
                }
                    C[l][c]=aux;
            }
        }

        System.out.println();
        for (int l = 0; l < C.length; l++) {
            for (int c = 0; c < C[l].length; c++) {
                System.out.print("\t" + C[l][c]);
            }
            System.out.println();
        }


    }
}
