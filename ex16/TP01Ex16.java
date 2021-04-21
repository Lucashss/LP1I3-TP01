import java.util.Scanner;

public class TP01Ex16 {
    public static void main(String[] args) {

        /*16. Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
        seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
        Lembre-se que uma função trigonométrica trabalha em radianos.*/

        double r, s, c, t, se;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do ângulo: ");
        r = entrada.nextDouble();
        r = (r * Math.PI) / 180;
        s = Math.sin(r);
        c = Math.cos(r);
        t = Math.tan(r);
        se = 1 / c;
        System.out.print("O seno de " + r + " radianos é: " + s);
        System.out.print("O coseno de " + r + " radianos é: " + c);
        System.out.print("A tangente de " + r + " radianos é: " + t);
        System.out.print("A secante de " + r + " radianos é: " + se);

    }
}
