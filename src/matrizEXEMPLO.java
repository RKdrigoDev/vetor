import java.util.Scanner;

public class matrizEXEMPLO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][2];
        // ter os dados
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.println("valor-->");
                m[i][j] = sc.nextInt();
            }
        }
        //impressão da matriz
       for (int i=0; i<m.length; i++){
           for (int j=0; j<m[i].length; j++){
               System.out.print(m[i][j]+"\t");
           }
           System.out.println();
       }
    }
}
