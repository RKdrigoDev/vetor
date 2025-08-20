import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] mes={"janeiro", "fevereiro", "março"," abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro" };
        double [] temp= new double[mes.length];
        double aux, media=0;
        for (int i=0;i< mes.length; i++){
            System.out.println("digite a temperatura do mes "+mes[i]);
            temp[i]= sc.nextDouble();
            media= media+temp[i];

        }
        media=media/mes.length;
        System.out.println("a media do ano é "+media);
        for (int i=0; i<mes.length; i++){
            if (temp[i]>media){
                System.out.println(mes[i]+" "+temp[i]);
            }
        }
    }
}
