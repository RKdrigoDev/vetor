import java.util.Random;

public class maiorValor {
    public static void main(String[] args) {
        Random r=new Random();
        int maior=0, linha, coluna;
        int[][] m=new int[3][3];
        for (int l=0; l<m.length; l++){
            for (int c=0; c<m.length; c++){
                m[l][c]= r.nextInt(0,1000);
                System.out.print(+m[l][c]+"\t");
                if (maior<m[l][c]){
                    maior=m[l][c];
                }
            }
            System.out.println();
        }
        System.out.println("\nO maior número da matriz é "+maior);

        //imprimir a localizaçao do maior
        for (int l=0; l<m.length; l++){
            for (int c=0; c<m.length; c++){
                if (m[l][c]==maior){
                    System.out.println("linha "+l+" coluna "+c);
                }
            }
        }
    }
}
