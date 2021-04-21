import java.util.Scanner;

public class TP01Ex02 {
    public static void main(String[] args) {
        //2. Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
        double a, area;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor da aresta: ");
        a = entrada.nextDouble();
        area = a * a;
        System.out.print("Se a aresta do quadrado é " + a + " sua área total será " + area);
    }
}
