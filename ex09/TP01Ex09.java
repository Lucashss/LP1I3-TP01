import java.util.Scanner;

public class TP01Ex09 {
    public static void main(String[] args) {
        
        /*9. Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
        valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.*/

        double r;
        double i ;
        double e;

        Scanner inicio = new Scanner(System.in);

        System.out.print("Digite o valor da resistência: ");
        r = inicio.nextDouble();

        System.out.print("Digite o valor da corrente elétrica: ");
        i = inicio.nextDouble();
                
        e = i * r;
        System.out.println("A tensão do circuito é: " + e + "V");
        inicio.close();
    }
}
