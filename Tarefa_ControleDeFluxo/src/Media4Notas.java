import java.util.Scanner ;

public class Media4Notas {

     public static void main (String []args){
          System.out.println("Digite suas notas:");
          Scanner leitura= new Scanner(System.in);

          System.out.println("Primeira nota:");
          double nota1 = leitura.nextDouble();

          System.out.println("Segunda nota:");
          double nota2 = leitura.nextDouble();

          System.out.println("Terceira nota:");
          double nota3 = leitura.nextDouble();

          System.out.println("Quarta nota:");
          double nota4 = leitura.nextDouble();

          double media = (nota1 + nota2 + nota3 + nota4) / 4;

          System.out.println("Sua media é:" + media);

          if(media >= 7){
               System.out.println("Aprovado");
          }else if(media >= 5){
               System.out.println("Recuperação");
          }else{
               System.out.println("Reprovado");
          }
     }
}
