import java.util.Scanner;

public class TP01Ex05 {
    public static void main(String[] args) {
        
        //5. Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.

        double diametro;
        double volume;

        Scanner inicio = new Scanner(System.in);
        System.out.print("Digite o valor do diametro da esfera: ");

        diametro = inicio.nextDouble();
        
        volume = (4 * 3.1415 * (Math.pow(diametro,3) ) ) / 3;

        System.out.println("O volume da  esfera é: " + volume + "m³");
        inicio.close();
    }
}
