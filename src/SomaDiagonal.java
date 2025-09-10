import java.util.Random;

public class SomaDiagonal {
    public static void main(String[] args) {
        Random r=new Random();
        int diagonal1=0, diagonal2=0;
        int[][] m=new int[4][4];
        for (int l=0; l<m.length; l++){
            for (int c=0; c<m.length; c++){
                m[l][c]=r.nextInt(1,16);
                System.out.print(m[l][c] + "\t");
                if (l==c){
                    diagonal1+=m[l][c];
                }
                if (l+c == m.length-1){
                    diagonal2+=m[l][c];
                }
            }
            System.out.println();

        }
        System.out.println("soma da principal "+diagonal1);
        System.out.println("soma da secundária "+diagonal2);

    }
}
