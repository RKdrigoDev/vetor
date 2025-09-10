import java.text.DecimalFormat;
import java.util.Random;

public class mediaDeTemperaturaAnual {
    public static void main(String[] args) {
        Random r=new Random();
        double aux;
        int anoMaior=0, anoMenor=0;
        double maiorMedia=Double.MIN_VALUE, menorValor=Double.MAX_VALUE;
        DecimalFormat df=new DecimalFormat("0.00");
        double[][] t=new double[10][12];
        double[] media=new double[t.length];
        for (int l=0; l< t.length; l++){
            aux=0;
            for (int c=0; c<t[l].length; c++){
                t[l][c]=r.nextDouble(15,40);
                System.out.print(df.format(t[l][c])+"\t");
                aux+=t[l][c];


            }
            media[l]=aux/t[l].length;
            System.out.println();
            if (media[l]<maiorMedia){
                maiorMedia=media[l];
                anoMaior=l;
            }
            if (media[l]<menorValor){
                menorValor=media[l];
                        anoMenor=l;
            }
        }
        //impressão da média de cada ano
        for (int l=0; l<media.length; l++){
            System.out.println("ano "+(l+1)+"--> "+ df.format(media[l]));
        }
        //impressão do ano com a maior e a menor media
        System.out.println("ano com a maior media de temperatura "+anoMaior);
        System.out.println("ano com a menor media de temperatura "+anoMenor);

    }
}
