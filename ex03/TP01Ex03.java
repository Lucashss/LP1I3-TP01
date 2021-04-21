import java.util.Scanner;

public class TP01Ex03 {
    public static void main(String[] args) {
        
        //3. Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será digitado.

        int d;
        double area;

        Scanner inicio = new Scanner(System.in);

        System.out.print("Digite o valor da diagonal do quadrado : ");
        d = inicio.nextInt();
        area = (Math.pow(d, 2)) / 2;
        System.out.println("A area do quadrado é: " + area);
        inicio.close();
    }
}
