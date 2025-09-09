import java.util.Random;
import java.util.Scanner;

public class frequencia {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int quant,cont, maior=0;
        System.out.println("digite uma quantidade de números");
        quant=sc.nextInt();
        int[] num=new int[quant];
        for (int i=0; i< num.length; i++){
            num[i]=r.nextInt(1,11);
            System.out.println(num[i]+" ");
        }
        for (int i=0; i< num.length; i++){
            cont=0;
            for (int k=0; k<num.length-1;k++ ){
                if (num[i] == num[k]){
                    cont++;
                }

            }
            if (cont>maior){
                maior=cont;
            }
        }
        System.out.println("\ngrau do vetor é "+maior);
    }
}
