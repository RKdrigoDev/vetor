import java.util.Scanner;

public class número {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int valor;
        int[] number= new int[10];
        for (int i=0; i<number.length; i++){
            System.out.println("digite um número");
            number[i]=sc.nextInt();
            if (number[i]<0){
                System.out.println("não pode");
            }

        }
        System.out.println("\nDados antes da inverção");
        for (int i=0; i<number.length; i++){
            System.out.println(number[i]+" ");
        }
        System.out.println("\nDados antes depois da inversão");
        for (int i=0; i<number.length; i++){
            System.out.println(number[i]+" ");
        }
    }
}
