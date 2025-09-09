import java.util.Scanner;

public class arquivo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arquivo;
        double mega, giga;
        System.out.println("tem quantos arquivos?");
        arquivo = sc.nextInt();
        String[] name = new String[arquivo];
        long[] tamanho = new long[arquivo];
        for (int i = 0; i < name.length; i++) {
            System.out.println("digite o nome do arquivo" + (i + 1));
            name[i] = sc.next();
            System.out.println("digite o tamanho do arquivo " + name[i]);
            tamanho[i] = sc.nextLong();


        }
        for (int i = 0; i < name.length; i++) {
            mega =(double)tamanho[i]/(1024 * 1024);
            giga = mega / 1024;
            System.out.println("o arquivo "+name[i]+" e o seu tamanho em mega e giga respectivamente seriam "+mega+", "+giga);

        }
    }
}

