import java.util.Scanner;

public class TP01Ex17 {
    public static void main(String[] args) {

        //17. Entrar via teclado com dois valores quaisquer X e Y. Calcular e exibir o
        //cálculo XY (X elevado a Y). Pesquisar as funções Exp e Ln.

        double x;
        double y;
        double xy;

        Scanner inicio = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        x = inicio.nextDouble();

        System.out.print("Digite o segundo valor: ");
        y = inicio.nextDouble();
        
        xy = Math.pow(x,y);

        System.out.println("O resultado é " + xy);
        inicio.close();
    }
}
