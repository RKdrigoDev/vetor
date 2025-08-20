import java.util.Scanner;

public class número {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int valor, aux;
        int[] number= new int[10];
        for (int i=0; i<number.length; i++){
            System.out.println("digite um número");
            number[i]=sc.nextInt();
        }
        System.out.println("\nDados antes da inverção");
        for (int i=0; i<number.length; i++){
            System.out.println(number[i]+" ");
        }

        for (int i=0; i<number.length/2; i++){
            aux=number[i];
            number[i]= number[number.length-1-i];
            number[number.length-1-i]=aux;

        }
        System.out.println("\nDados  depois da inversão");
        for (int i=0; i<number.length; i++){
            System.out.println(number[i]+" ");
        }
    }
}
