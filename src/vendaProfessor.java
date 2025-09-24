import java.text.DecimalFormat;
import java.util.Random;

public class vendaProfessor {
    public static void main(String[] args) {
        Random r = new Random();
        double total, maior=Integer.MIN_VALUE;
        int  maiorMes=0;
        String[] produto = {"eletônicos", "roupas", "alimentos"};
        String[] mes = {"janeiro", "fevereiro", "março", "abril", "maio", "junho"};
        double[][] venda = new double[produto.length][mes.length];
        DecimalFormat df = new DecimalFormat("#,##0.00");

        //gerando vendas
        for (int i = 0; i < venda.length; i++) {
            for (int j = 0; j < venda[i].length; j++) {
                venda[i][j] = r.nextDouble(1, 6);
                System.out.print("R$" + df.format(venda[i][j]) + "\t");
            }
            System.out.println();
        }
        //soma do total de vendas por categoria
        for (int i = 0; i < venda.length; i++) {
            total=0;
            for (int j = 0; j < venda[i].length; j++) {
                total+=venda[i][j];
            }
            System.out.println(produto[i]+" --> R$"+df.format(total));
        }
        //mês com maior venda
        System.out.println("\n total de vendas por mes");
        for (int j = 0; j < mes.length; j++) {
            total=0;
            for (int i = 0; i < venda.length; i++) {
                total+=venda[i][j];

                }
                System.out.println("em "+mes[j]+"o valor foi de "+df.format(total));
            if (total>maior){
                maior=total;
                maiorMes=j;

            }

        }
        System.out.println("o mês com a maior venda foi "+mes[maiorMes]);
    }
}