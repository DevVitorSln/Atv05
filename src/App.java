import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Faça um Programa que converta metros para centímetros.

        Scanner scanner = new Scanner(System.in);
 
        double metrosInformados, printConversaoCentimetros;

        System.out.println("Metros: ");
        metrosInformados = scanner.nextDouble();

        printConversaoCentimetros = metrosInformados * 100;

        System.out.println("Conversão para centímetros: " + printConversaoCentimetros);
    }
}
