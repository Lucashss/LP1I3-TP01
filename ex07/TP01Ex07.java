import java.util.Scanner;

public class TP01Ex07 {
    public static void main(String[] args) {
        
        //7. Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados.

        double primeiro;
        double segundo;
        double media;

        Scanner inicio = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        primeiro = inicio.nextDouble();

        System.out.print("Digite o segundo valor: ");
        segundo = inicio.nextDouble();
                
        media = Math.sqrt(primeiro * segundo);

        System.out.println("a média geométrica dos valores digitados é: " + media);

        inicio.close();
    }
}
