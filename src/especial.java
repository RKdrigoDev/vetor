import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class especial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quant;
        boolean especial = true;
        System.out.println("digite o tamanho do vetor");
        quant = sc.nextInt();
        int[] number = new int[quant];
        for (int i = 0; i < number.length; i++) {
            System.out.println("valor "+i);
            number[i] = sc.nextInt();
        }
        //verificar se é especial ou não
        for (int i = 0; i < number.length-1; i++) {
            if (number[i] % 2 == number[i + 1] % 2) {
                especial = false;
                break;
            }
        }
        if (especial) {
            System.out.println("especial");
        }
        else {
            System.out.println("não é especial");
        }
    }

}
