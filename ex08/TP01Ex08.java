import java.util.Scanner;

public class TP01Ex08 {
    public static void main(String[] args) {

        /*8. Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
        dois metros e que um quilômetro possui mil metros, fazer um programa para
        converter milhas marítimas em quilômetros.*/
        
        double m, km;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Dgite o valor das milhas que deseja converter para km: ");
        m = entrada.nextDouble();
        km = (m * 1852) / 1000;
        System.out.print("O valor de " + m + " milhas é igual a " + km + " quilômetros.");
    }
    
}
