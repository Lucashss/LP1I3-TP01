import java.util.Scanner;

public class TP01Ex13 {
    public static void main(String[] args) {

        /*13. Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
        valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
        (em s) que serão digitados.*/
        
        double vi;
        double a;
        double t;
        double vf;

        Scanner inicio = new Scanner(System.in);

        System.out.print("Digite a velocidade inicial do automóvel (em m/s): ");
        vi = inicio.nextDouble();

        System.out.print("Digite a aceleração do automóvel (em m/s²):  ");
        a = inicio.nextDouble();

        System.out.print("Digite o tempo do percurso (em s):  ");
        t = inicio.nextDouble();

        vf = (vi + a * t) * 3.6; 

        System.out.println("A velocidade final do automóvel é: " + vf + "Km/h");

        inicio.close();
    }
}
