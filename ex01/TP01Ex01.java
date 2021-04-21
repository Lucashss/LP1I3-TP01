import java.util.Scanner;

public class TP01Ex01 {
    public static void main(String[] args) {
        //1. Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.

        double base;
        double altura;
        double area;

        Scanner inicio = new Scanner(System.in);
        System.out.print("Digite o valor da base: ");
        base = inicio.nextDouble();
        System.out.print("Digite o valor da altura: ");
        altura = inicio.nextDouble();
        area = base * altura;
        System.out.println("A area do retangulo é: " + area);
        inicio.close();
    }
}
