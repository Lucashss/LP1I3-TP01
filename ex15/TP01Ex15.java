import java.util.Scanner;

public class TP01Ex15 {
    public static void main(String[] args) {
        
        /*15. Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
        dólares. Calcular e exibir o valor correspondente em Reais (R$).*/

        double cotacao;
        double qtd;
        double valor;

        Scanner inicio = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        cotacao = inicio.nextDouble();

        System.out.print("Digite a quantidade que deseja converte em reais:  ");
        qtd = inicio.nextDouble();
        
        valor = cotacao * qtd;     

        System.out.println("O valor correnpondente em Reais é: R$" + valor);

        inicio.close();
    }
}
