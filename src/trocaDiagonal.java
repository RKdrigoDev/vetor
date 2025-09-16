import java.util.Random;

public class trocaDiagonal {
    public static void main(String[] args) {
        Random r=new Random();
        int aux,k;
        int[][] m=new int[5][5];
        int[] v=new int[m.length];
        for (int l=0; l<m.length; l++){
            for (int c=0; c<m.length;c++){
                m[l][c]=r.nextInt(1,16);
                System.out.print(m[l][c]+"\t");

            }
            System.out.println();

                }
        k=m.length-1;
        for (int l=0; l<m.length; l++) {
            aux=m[l][l];
            m[l][l]=m[l][k];
            m[l][k]=aux;
            k--;




        }
        System.out.println();
        for (int l=0; l<m.length; l++){
            for (int c=0; c<m.length;c++){
                System.out.print(m[l][c]+"\t");

                }
            System.out.println();
            }

        }
    }

