import java.util.Scanner;

public class TP01Ex11 {
    public static void main(String[] args) {
        
        //11. A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.

        Scanner inicio = new Scanner(System.in);

        double diametro;
        double area;

        System.out.print("Digite o diâmetro do circulo: ");

        diametro = inicio.nextDouble();
        area = (Math.pow(diametro, 2))  * 3.1415;             
        
        System.out.println("A área do circulo é :" + area + "m²");
        inicio.close();
    }
}
